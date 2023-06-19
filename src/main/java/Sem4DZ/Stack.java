package Sem4DZ;

public class Stack {
    private int maxSize; // maximum size of the stack
    private int[] stackArray; // array to store the stack elements
    private int top; // index of the top element in the stack

    public Stack(int capacity) {
        maxSize = capacity;
        stackArray = new int[maxSize];
        top = -1; // stack is initially empty
    }

    public int size() {
        return top + 1; // number of elements in the stack
    }

    public boolean empty() {
        return top == -1; // true if stack is empty, false otherwise
    }

    public void push(int item) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = item; // increment top and insert the item
            System.out.println("Pushed element: " + item);
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top]; // return the top element without removing it
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int item = stackArray[top--]; // retrieve and remove the top element
        System.out.println("Popped element: " + item);
        return item;
    }

    public static void runDZ4() {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Size of stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Size of stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());
    }
}

