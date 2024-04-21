public class LibraryItem {
    private String title;
    private String itemType;

    public LibraryItem(String title, String itemType) {
        this.title = title;
        this.itemType = itemType;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Type: " + itemType);
    }
}
