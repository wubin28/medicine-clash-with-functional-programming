import java.util.Date;

public class Customer {
    private Date creationDate;

    public Customer(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Date getCreationDateImmutable() {
        return new Date(this.creationDate.getTime());
    }
}