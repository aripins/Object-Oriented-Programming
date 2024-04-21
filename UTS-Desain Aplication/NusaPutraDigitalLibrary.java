import java.util.ArrayList;
import java.util.List;

public class NusaPutraDigitalLibrary {
    private List<LibraryItem> items;
    private List<Bookmark> bookmarks;

    public NusaPutraDigitalLibrary() {
        this.items = new ArrayList<>();
        this.bookmarks = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addBookmark(LibraryItem item) {
        bookmarks.add(new Bookmark(item));
    }

    public void printAllItems() {
        for (LibraryItem item : items) {
            item.printDetails();
            System.out.println();
        }
    }

    public void printBookmarks() {
        System.out.println("Audiobook List:");
        for (Bookmark bookmark : bookmarks) {
            bookmark.getItem().printDetails();
            System.out.println();
        }
    }
}
