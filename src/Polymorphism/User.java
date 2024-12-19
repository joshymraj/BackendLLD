package Polymorphism;

public class User {
    private String name;
    private String email;
    private String password;

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void login(){
        System.out.println("User has logged in!");
    }
}
