package AbstractClasses;

public abstract class Animal {
    private String name;

    public void walk(){
        System.out.println("Animal is Walking");
    }

    public abstract void eat();
    public abstract void showDetails();
}
