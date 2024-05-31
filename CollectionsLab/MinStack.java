//lab4_b2
//Create a Java class called MinStack of Integers that supports standard stack operations (push, pop, top, and isEmpty) and also provides a getMin method that returns the minimum element in the stack. (Hints: Keep another stack that will hold the minimum value on the top of the stack.)

import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    private Stack stack;
    private Stack minStack;

    public MinStack(int size) {
        stack = new Stack(size);
        minStack = new Stack(size);
    }

    public void push(int item) {
        stack.push(item);
        if (minStack.isEmpty() || item <= minStack.peek()) {
            minStack.push(item);
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int popped = (int) stack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getMin() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return minStack.peek();
    }
}
