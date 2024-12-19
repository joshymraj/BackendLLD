package Lab.LibraryManagementSystem;

import java.util.UUID;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;

    private static int totalUsers;

    public User() {
        this.userId = generateUniqueId();
        totalUsers++;
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    public User(User user) {
        this.userId = user.userId;
        this.name = user.name;
        this.contactInfo = user.contactInfo;
        totalUsers++;
    }

    public final String generateUniqueId(){
        return UUID.randomUUID().toString();
    }

    public int totalTotalUsers() {
        return totalUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}
