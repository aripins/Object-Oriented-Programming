public class Book {
    int idBook;
    String title;
    String author;
    String description;
    String categories;
    int qty;
    boolean booked;

    public Book(int idBook, String title, String author, String description, String categories, int qty, boolean booked) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.description = description;
        this.categories = categories;
        this.qty = qty;
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", categories='" + categories + '\'' +
                ", qty=" + qty +
                ", booked=" + booked +
                '}';
    }
}
