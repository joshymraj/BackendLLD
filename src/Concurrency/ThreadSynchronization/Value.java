package Concurrency.ThreadSynchronization;

public class Value {
    private int val;

    public Value() {}

    public Value(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public synchronized void increment(int val) {
        this.val += val;
    }

    public synchronized void decrement(int val) {
        this.val -= val;
    }
}
