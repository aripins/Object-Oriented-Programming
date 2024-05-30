import java.util.Date;

public class Transaction {
    int id;
    Date date;
    int idMember;
    int idBook;
    int status; // 1=booked, 2=finished

    public Transaction(int id, Date date, int idMember, int idBook, int status) {
        this.id = id;
        this.date = date;
        this.idMember = idMember;
        this.idBook = idBook;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", idMember=" + idMember +
                ", idBook=" + idBook +
                ", status=" + status +
                '}';
    }
}
