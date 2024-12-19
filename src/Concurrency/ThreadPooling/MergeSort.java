package Concurrency.ThreadPooling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> arr;

    public MergeSort(ArrayList<Integer> arr) {
        this.arr = arr;
    }


    @Override
    public List<Integer> call() throws Exception {
        return List.of();
    }
}
