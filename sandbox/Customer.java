import java.util.Set;

public class Customer {
    public String id;
    public String name;
    public Set<Medicine> medicines;

    public Customer(String id, String name, Set<Medicine> medicines) {
        this.id = id;
        this.name = name;
        this.medicines = medicines;
    }
}