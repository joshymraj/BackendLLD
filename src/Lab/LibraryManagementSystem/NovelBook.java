package Lab.LibraryManagementSystem;

public class NovelBook extends Book {
    private String genre;

    public NovelBook() {
        super();
    }

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Novel Book Details");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + this.genre);
    }
}
