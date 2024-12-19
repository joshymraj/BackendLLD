package Concurrency.ThreadSynchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Client {
    private static final ReadWriteLock readWriteLock
            = new ReentrantReadWriteLock();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
    }
}
