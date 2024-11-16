import java.util.Scanner;

public class Stack {
    private int[] stack;
    private int top;
   public int capacity;

    /**
     * Constructor to initialize the stack with a given capacity.
     * 
     * @param capacity the maximum number of elements the stack can hold.
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    /**
     * Constructor to initialize the stack with a default capacity of 10.
     */
    public Stack() {
        this(10);
    }

    /**
     * Pushes an element onto the stack.
     * 
     * @param value the element to be pushed onto the stack.
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stack[++top] = value;
    }

    /**
     * Pops the top element from the stack.
     * 
     * @return the popped element.
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // or throw an exception
        }
        return stack[top--];
    }

    /**
     * Prints all elements in the stack.
     */
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the stack is full.
     * 
     * @return true if the stack is full, false otherwise.
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * Returns the size of the stack.
     * 
     * @return the number of elements in the stack.
     */
    /*public int size() {
        return top + 1;
    }+/

    /**
     * Returns the top element of the stack without removing it.
     * 
     * @return the top element of the stack.
     */
    /*public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // or throw an exception
        }
        return stack[top];
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Traverse stack");
           // System.out.println("4. Check if stack is empty");
           // System.out.println("5. Check if stack is full");
           // System.out.println("6. Get stack size");
            //System.out.println("7. Peek top element");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    stack.traverse();
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    if (stack.isFull()) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;
                /*case 6:
                    System.out.println("Stack size: " + stack.size());
                    break;
                case 7:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;*/
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}