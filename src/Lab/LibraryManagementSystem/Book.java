package Lab.LibraryManagementSystem;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private BookType bookType;
    private BookCategory bookCategory;
    private boolean isAvailable;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isAvailable = true;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(Book book) {
        this.isAvailable = true;
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean lend(User user) {
        if(!this.isAvailable) {
            return false;
        }

        this.isAvailable = false;
        return true;
    }

    public void returnBook(User user) {
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public abstract void displayBookDetails();
}
