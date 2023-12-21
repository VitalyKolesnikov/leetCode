package tasks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    @Test
    void case1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());
    }

    @Test
    void case2() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();

        assertEquals(0, minStack.top());
    }

    @Test
    void case3() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();

        assertEquals(-2, minStack.getMin());
    }

}
