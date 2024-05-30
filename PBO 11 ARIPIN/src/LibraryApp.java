import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class LibraryApp {
    private static final String BOOKS_FILE = "data/books.json";
    private static final String MEMBERS_FILE = "data/members.json";
    private static final String TRANSACTIONS_FILE = "data/transactions.json";

    private static List<Book> books = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    private static List<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
        createJsonFilesIfNotExist();
        loadData();

        addBook(new Book(1, "Harry Potter", "J.K. Rowling", "Fantasy novel", "Fantasy", 10, false));
        addMember(new Member(1, "John Doe", "1234567890", "john.doe@example.com", "123 Elm St"));
        addTransaction(new Transaction(1, new Date(), 1, 1, 1));

        saveData();

        System.out.println("Books: " + books);
        System.out.println("Members: " + members);
        System.out.println("Transactions: " + transactions);
    }

    private static void createJsonFilesIfNotExist() {
        try {
            File booksFile = new File(BOOKS_FILE);
            File membersFile = new File(MEMBERS_FILE);
            File transactionsFile = new File(TRANSACTIONS_FILE);

            if (!booksFile.exists()) {
                booksFile.getParentFile().mkdirs(); 
                booksFile.createNewFile();
                Utils.writeJsonFile(BOOKS_FILE, new ArrayList<Book>());
            }
            if (!membersFile.exists()) {
                membersFile.createNewFile();
                Utils.writeJsonFile(MEMBERS_FILE, new ArrayList<Member>());
            }
            if (!transactionsFile.exists()) {
                transactionsFile.createNewFile();
                Utils.writeJsonFile(TRANSACTIONS_FILE, new ArrayList<Transaction>());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadData() {
        books = Utils.readJsonFile(BOOKS_FILE, new TypeToken<List<Book>>() {}.getType());
        members = Utils.readJsonFile(MEMBERS_FILE, new TypeToken<List<Member>>() {}.getType());
        transactions = Utils.readJsonFile(TRANSACTIONS_FILE, new TypeToken<List<Transaction>>() {}.getType());
    }

    private static void saveData() {
        Utils.writeJsonFile(BOOKS_FILE, books);
        Utils.writeJsonFile(MEMBERS_FILE, members);
        Utils.writeJsonFile(TRANSACTIONS_FILE, transactions);
    }

    private static void addBook(Book book) {
        books.add(book);
    }

    private static void addMember(Member member) {
        members.add(member);
    }

    private static void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
