package IntroToOOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.id = 1;
        student1.name = "Josh";
        student1.setAge(40);
        student1.course = "Java";
        student1.email = "joshymraj@gmail.com";
        student1.gradYear = 2006;

        Student student2 = new Student();

        student2.id = 2;
        student2.name = "Mohit";
        student2.setAge(30);
        student2.course = "LLD";
        student2.email = "mohit@gmail.com";
        student2.gradYear = 2012;

        student1.printDetails();
    }
}