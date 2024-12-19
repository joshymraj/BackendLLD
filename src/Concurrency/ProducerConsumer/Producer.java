package Concurrency.ProducerConsumer;

public class Producer implements Runnable {
    private Store store;
    public Producer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        // Producer should always keep on producing
        while(true){
            if(store.getItems().size() < store.getMaxSize()){
                store.addItem(store.getMaxSize() + 1);
            }
        }
    }
}
