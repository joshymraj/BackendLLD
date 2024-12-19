package Inheritance;

public class Client {
    public static void main(String[] args) {
        User user = new User();

        Student student = new Student();


        Instructor instructor = new Instructor();

        //Whenever a child constructor is called, its parent constructor also is invoked automatically.
    }
}
