public class Student {
    int id;
    int age;
    int gradYear;
    String name;
    String email;
    String course;

    public Student() {

    }

    public Student(int id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public void raiseHR() {
        System.out.println("HR raised");
    }

    public void rateClass() {
        System.out.println("Rated class");
    }

    public void printDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Grad Year: " + gradYear);
    }
}