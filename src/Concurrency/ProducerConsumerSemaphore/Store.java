package Concurrency.ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
//    private List<Object> items;
    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
//        this.items = new ArrayList<>(maxSize);
        this.items = new ConcurrentLinkedQueue<Object>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void addItem(Object item) {
        if(items.size() > maxSize){
            return;
        }
        items.add(item);
        System.out.println("New Item Added. Current size: " + items.size());
    }

    public void removeItem() {
        items.remove(items.size() - 1);
        System.out.println("Item Removed. Current size: " + items.size());
    }

//    public List<Object> getItems() {
//        return items;
//    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }
}
