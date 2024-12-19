package Concurrency.ThreadSynchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReadWriteLock;

public class Subtractor implements Callable<Void> {
    private Value value;
    private ReadWriteLock readWriteLock;

    public Subtractor(Value value, ReadWriteLock readWriteLock) {
        this.value = value;
        this.readWriteLock = readWriteLock;//Shared Lock between Adder and Subtractor
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i <= 10000; i++) {
//            readWriteLock.writeLock().lock();
            synchronized (value) {
                this.value.setVal(value.getVal() - i);//Critical Section
            }
//            readWriteLock.writeLock().unlock();
        }

        return null;
    }
}
