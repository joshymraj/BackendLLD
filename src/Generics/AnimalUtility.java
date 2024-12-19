package Generics;

import java.util.List;

public class AnimalUtility {
    public static <T extends Animal> void printAnimalNames(List<T> animals) {
        for(T animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void printAnimal(List<? extends Animal> animals, String name) {
        for(Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public void doSomething(List<? super Dog> temp) {
        //super is used when we want to insert in a list any type
        temp.add(new Dog());
//        temp.add(new Mammal());
    }
}
