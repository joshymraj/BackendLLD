package Concurrency.ThreadPooling;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;

    public Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i <= 10000; i++) {
            this.value.setVal(value.getVal() - i);
        }

        return null;
    }
}
