public class StackDriver {
    public static void main(String[] args) {
        // Create a new instance of the Stack class with a capacity of 3
        Stack newStack = new Stack(3);

        // Attempt to pop an item from the empty stack (should display a message)
        newStack.pop();

        // Push the value 10 onto the stack
        newStack.push(10);

        // Push the value 20 onto the stack
        newStack.push(20);

        // Pop an item from the stack (value 20 will be removed)
        newStack.pop();

        // Push the value 30 onto the stack
        newStack.push(30);

        // Push the value 40 onto the stack (stack is now full)
        newStack.push(40);

        // Push the value 50 onto the stack (should display a message)
        newStack.push(50);
    }
}

