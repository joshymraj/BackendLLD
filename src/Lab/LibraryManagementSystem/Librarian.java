package Lab.LibraryManagementSystem;

public class Librarian extends User {
    private String employeeNumber;

    public Librarian() {
        super();
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name: " + this.getName());
        System.out.println("Employee Number: " + this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {
        //TODO: Implement later
    }

    public void removeBook(Book book) {
        //TODO: Implement later
    }
}
