package Inheritance;

import CopyConstructors.Batch;

public class Student extends User {
    private double psp;
    private Batch batch;

    public Student() {
        System.out.println("Student Default Constructor called!");
    }

    public Student(double psp, Batch batch) {
        System.out.println("Student Parameterised Constructor called!");
        this.psp = psp;
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
