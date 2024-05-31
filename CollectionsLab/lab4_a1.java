public class lab4_a1 {
    private int maxSize;
    private int[] stackArray;
    private int top;


    public lab4_a1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

 
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow, cannot push " + item);
            return;
        }
        stackArray[++top] = item;
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return stackArray[top--];
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return stackArray[top];
    }


    public boolean isEmpty() {
        return (top == -1);
    }


    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
