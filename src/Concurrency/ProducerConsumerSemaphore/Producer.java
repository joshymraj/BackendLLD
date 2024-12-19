package Concurrency.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Concurrency.ProducerConsumerSemaphore.Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
                store.addItem(store.getItems().size() - 1);
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
