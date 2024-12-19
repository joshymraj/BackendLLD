package IntroToOOP;

public class Student {
    int id;
    private int age;
    int gradYear;
    public String name;
    public String email;
    public String course;

    public Student() {

    }

    public Student(int id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void raiseHR() {
        System.out.println("HR raised");
    }

    public void rateClass() {
        System.out.println("Rate class");
    }

    public void printDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Grad Year: " + gradYear);
    }
}
