package Kms.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Testing Stack Operations:");

        System.out.println("Pushing 10, 20, and 30 onto the stack...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Current stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popping top element: " + stack.pop());

        System.out.println("Current stack after pop: " + stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Stack size: " + stack.size());

        System.out.println("Popping remaining elements...");
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        try {
            System.out.println("Trying to pop from an empty stack...");
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
