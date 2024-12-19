package Interfaces;

public class LinkedListStack implements Stack {
    @Override
    public void push(int data) {
        System.out.println("Pushing " + data + " to the LinkedListStack");
    }

    @Override
    public int pop() {
        System.out.println("Popping from LinkedListStack");
        return 0;
    }

    @Override
    public int top() {
        System.out.println("Peeking to the top of LinkedListStack");
        return 0;
    }
}
