public class Main {
    public static void main(String[] args) {
        NusaPutraDigitalLibrary library = new NusaPutraDigitalLibrary();

        library.addItem(new Book("Java Script Data Structures and Algorithms", "Sammie Bae", "Programming"));
        library.addItem(new Book("MAHIR AKUNTANSI", "Dr. Temy setiawan & Theresia Hesty Bwareling M.Ak", "Finance"));
        library.addItem(new Book("Harry Potter and The Goblet Of Fires", "J.K. Rowling", "Fantasy"));

        // add audiobook to bookmarks
        library.addBookmark(new Audiobook("Journal of Terror: Kelana", "Sweta Kartika"));
        library.addBookmark(new Audiobook("Petualangan Sherlock Holmes", "Arthur Conan Doyle"));

        // print all items in library
        System.out.println("All Items in Library:");
        System.out.println();
        library.printAllItems();
        
        // print bookmarks list
        library.printBookmarks();
    }
}
