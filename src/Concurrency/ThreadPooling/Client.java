package Concurrency.ThreadPooling;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //fixed ThreadPool : Only creates declared number of threads. No extra threads can be created
        ExecutorService fixedThreadPoolExecutorService = Executors.newFixedThreadPool(5);

        //cached ThreadPool : New threads will be created iff there is a need for new thread
        ExecutorService cachedThreadPoolExecutorService = Executors.newCachedThreadPool();

        for(int i = 0; i < 100; i++) {
            if(i == 80) {
                System.out.println();
            }
        }

        for(int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            fixedThreadPoolExecutorService.execute(numberPrinter);
            cachedThreadPoolExecutorService.execute(numberPrinter);
        }

        Value value = new Value(0);
        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        Future<Void> adderFuture = fixedThreadPoolExecutorService.submit(adder);
        Future<Void> subtractorFuture = fixedThreadPoolExecutorService.submit(subtractor);
        adderFuture.get();
        subtractorFuture.get();
        System.out.println(value.getVal());
    }

    private static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}