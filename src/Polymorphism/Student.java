package Polymorphism;

import java.util.Date;

public class Student extends User {
    private String batch;

    public void attendClass() {
        System.out.println("Student is attending class");
    }

    public void attendClass(String type, Date date) {

    }
}
