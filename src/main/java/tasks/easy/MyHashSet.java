package tasks.easy;

public class MyHashSet {

    private final boolean[] storage;

    public MyHashSet() {
        storage = new boolean[1_000_000 + 1];
    }

    public void add(int key) {
        storage[key] = true;
    }

    public void remove(int key) {
        storage[key] = false;
    }

    public boolean contains(int key) {
        return storage[key];
    }

}
