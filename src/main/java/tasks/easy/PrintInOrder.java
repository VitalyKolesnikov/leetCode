package tasks.easy;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class PrintInOrder {

    Semaphore semaphore1 = new Semaphore(0);
    Semaphore semaphore2 = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {
        var obj = new PrintInOrder();

        Callable<Void> first = () -> {
            obj.first(() -> System.out.println("first"));
            return null;
        };

        Callable<Void> second = () -> {
            try {
                obj.second(() -> System.out.println("second"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        };

        Callable<Void> third = () -> {
            try {
                obj.third(() -> System.out.println("third"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        };

        var pool = Executors.newCachedThreadPool();
        pool.invokeAll(List.of(third, first, second));
        pool.shutdown();
    }

    public void first(Runnable printFirst) {
        printFirst.run();
        semaphore1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        semaphore1.acquire();
        printSecond.run();
        semaphore2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        semaphore2.acquire();
        printThird.run();
    }
}
