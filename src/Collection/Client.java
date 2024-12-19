package Collection;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        List<Integer> stack = new Stack<>();

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> hashMap = new TreeMap<>();
        Map<String, Integer> treeMap = new LinkedHashMap<>();

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> linkedQueue = new PriorityQueue<>();
        Queue<Integer> hashQueue = new ArrayDeque<>();
    }
}
