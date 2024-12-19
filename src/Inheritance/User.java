package Inheritance;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User() {
        System.out.println("User Default Constructor called!");
    }

    public User(int id, String name, String email, String password) {
        System.out.println("User Parameterised Constructor called!");
    }
}
