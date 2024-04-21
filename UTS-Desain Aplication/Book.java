public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        super(title, "Book");
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}
