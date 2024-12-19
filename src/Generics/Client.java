package Generics;

import java.util.Collections;
import java.util.concurrent.ExecutionException;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    Pair pair = new Pair();
    pair.setFirst(10);
    pair.setSecond("Joshy");
    pair.setFirst("Raj");

    GenericPair<String, Integer> genericPair = new GenericPair<String, Integer>();
    genericPair.setFirst("Raj");

//    genericPair.setSecond("Joshy");
//    Double d = genericPair.getFirst();

    GenericPair noTypeInstance = new GenericPair();
    noTypeInstance.setFirst("Raj");
    noTypeInstance.setSecond("Joshy");

    String data = GenericPair.doSomething("Joshy");

    }
}
