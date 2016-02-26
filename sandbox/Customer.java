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

    @Override
    public String toString() {
        return "Customer " + this.name + " (" + this.id + ") taking medicines " + this.medicines;
    }

    @Override
    public boolean equals(Object obj) { 
        if (obj == this)
            return true;
        if (!(obj instanceof Customer))
            return false;
        Customer customer = (Customer) obj; 
        return customer.id == this.id &&
            customer.name == this.name;

    @Override
    public int hashCode() {
        int hashValue = 11;
        hashValue = 31 * hashValue + name; 
        hashValue = 31 * hashValue + id; 
        return hashValue;
    }
}