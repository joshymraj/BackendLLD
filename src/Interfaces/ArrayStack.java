package Interfaces;

public class ArrayStack implements Stack {
    @Override
    public void push(int data) {
        System.out.println("Pushing " + data + " to the ArrayStack");
    }

    @Override
    public int pop() {
        System.out.println("Popping from ArrayStack");
        return 0;
    }

    @Override
    public int top() {
        System.out.println("Peeking to the top of ArrayStack");
        return 0;
    }
}
