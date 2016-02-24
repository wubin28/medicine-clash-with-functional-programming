import java.util.Date;

public class User {
    private Date creationDate;

    public User(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Date getCreationDateImmutable() {
        return new Date(this.creationDate.getTime());
    }
}