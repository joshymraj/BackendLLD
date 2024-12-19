package Generics;

public class GenericPair<T, V> {
    T first;
    V second;

    public GenericPair(){

    }

    public GenericPair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static <S> S doSomething(S data) {
        return data;
    }
}
