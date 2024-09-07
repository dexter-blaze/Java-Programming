package day5;

import java.util.*;

class Stack {
    int[] arr;
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1; // Or throw an exception
        } else {
            return arr[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        for(int i = 0; i <= top; i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack1 = new Stack(10);
        Stack stack2 = new Stack(10);
        int popped, x;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Push to Stack 2");
            System.out.println("3. Pop from Stack 1");
            System.out.println("4. Pop from Stack 2");
            System.out.println("5. Check for empty");
            System.out.println("6. Display elements of stacks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    x = sc.nextInt();
                    stack1.push(x);
                    checkEqualStacks(stack1, stack2);
                    break;
                case 2:
                    System.out.print("Enter element to push: ");
                    x = sc.nextInt();
                    stack2.push(x);
                    checkEqualStacks(stack1, stack2);
                    break;
                case 3:
                    popped = stack1.pop();
                    if (popped != -1) {
                        System.out.println("Popped element from Stack 1: " + popped);
                    }
                    checkEqualStacks(stack1, stack2);
                    break;
                case 4:
                    popped = stack2.pop();
                    if (popped != -1) {
                        System.out.println("Popped element from Stack 2: " + popped);
                    }
                    checkEqualStacks(stack1, stack2);
                    break;
                case 5:
                    System.out.println("Stack 1 is " + (stack1.isEmpty() ? "empty" : "not empty"));
                    System.out.println("Stack 2 is " + (stack2.isEmpty() ? "empty" : "not empty"));
                    break;
                case 6:
                    System.out.println(stack1.isEmpty() ? "Stack1 is empty" : "Stack1 elements");
                    stack1.display();
                    System.out.println(stack2.isEmpty() ? "Stack2 is empty" : "Stack2 elements");
                    stack2.display();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void checkEqualStacks(Stack stack1, Stack stack2) {
        if (stack1.size() == stack2.size()) {
            System.out.println("Both stacks are of equal size and the size is " + stack1.size());
        }
    }
}