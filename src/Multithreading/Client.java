package Multithreading;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
        System.out.println("Main is printed in " + Thread.currentThread().getName());

        for(int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter);
            thread1.start();
        }
    }
}
//Callable: Return some values from thread
//ExecutorService: Thread pooling
//Adder Subtractor: The issue which can arise in threading