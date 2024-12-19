package Lab.LibraryManagementSystem;

public class Member extends User {
    final static int MAX_BORROW_LIMIT = 5;

    private int borrowedBooksCount;

    public Member() {
        super();
    }

    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Number of Books Borrowed: " + this.borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
