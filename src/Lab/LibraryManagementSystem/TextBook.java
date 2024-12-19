package Lab.LibraryManagementSystem;

public class TextBook extends Book {
    private String subject;
    private int edition;
    public TextBook() {
        super();
    }

    public TextBook(String isbn, String title, String author, int edition, String subject) {
        super(isbn, title, author);
        this.edition = edition;
        this.subject = subject;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Text Book Details");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Subject: " + this.subject);
        System.out.println("Edition: " + this.edition);
    }
}
