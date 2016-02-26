import java.util.List;

public class Customer {
    public String id;
    public String name;
    public List<Medicine> medicines;

    public Customer(String id, String name, List<Medicine> medicines) {
        this.id = id;
        this.name = name;
        this.medicines = medicines;
    }
}