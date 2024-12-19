package Multithreading;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World is printed in " + Thread.currentThread().getName());
    }
}
