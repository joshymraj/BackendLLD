package Concurrency.ThreadPooling;

public class NumberPrinter implements Runnable {
    private int _number;
    public NumberPrinter(int number) {
        this._number = number;
    }

    @Override
    public void run() {
        System.out.println("Printing number " + this._number + " in thread " + Thread.currentThread().getName());
    }
}
