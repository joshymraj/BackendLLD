package Concurrency.ProducerConsumer;

import java.util.concurrent.ExecutionException;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Store store = new Store(5);
        Producer producer = new Producer(store);
        new Thread(producer).start();
        Consumer consumer = new Consumer(store);
        new Thread(consumer).start();
    }
}
