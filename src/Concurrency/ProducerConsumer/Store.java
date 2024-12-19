package Concurrency.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void addItem(Object item) {
        items.add(item);
        System.out.println("New Item Added. Current size: " + items.size());
    }

    public void removeItem() {
        items.removeFirst();
        System.out.println("Item Removed. Current size: " + items.size());
    }

    public List<Object> getItems() {
        return items;
    }
}
