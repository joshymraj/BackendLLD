package Inheritance;

public class Instructor extends User {
    private double hoursTaught;
    private int modules;

    public Instructor() {
        System.out.println("Instructor Default Constructor called!");
    }

    public Instructor(String firstName, String lastName, String email, String password, double hoursTaught) {
        System.out.println("Instructor Parameterised Constructor called!");
    }

    public double getHoursTaught() {
        return hoursTaught;
    }

    public void setHoursTaught(double hoursTaught) {
        this.hoursTaught = hoursTaught;
    }

    public int getModules() {
        return modules;
    }

    public void setModules(int modules) {
        this.modules = modules;
    }
}
