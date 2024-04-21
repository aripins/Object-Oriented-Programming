public class Audiobook extends LibraryItem {
    private String narrator;

    public Audiobook(String title, String narrator) {
        super(title, "Audiobook");
        this.narrator = narrator;
    }
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Narrator: " + narrator);
    }
}
