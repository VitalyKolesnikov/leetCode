package tasks.medium;

import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class MinStack {

    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        this.stack.push(val);

        if (this.minStack.empty() || val <= this.getMin()) {
            this.minStack.push(val);
        } else {
            this.minStack.push(this.getMin());
        }
    }

    public void pop() {
        this.stack.pop();
        this.minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
