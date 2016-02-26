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
    public int hashCode() {
        return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
            // if deriving: appendSuper(super.hashCode()).
            append(id).
            append(name).
            toHashCode();
    }

    @Override
    public boolean equals(Object object) {
       if (!(object instanceof Customer))
            return false;
        if (object == this)
            return true;

        Customer customer = (Customer) object;
        return new EqualsBuilder().
            // if deriving: appendSuper(super.equals(object)).
            append(id, customer.id).
            append(name, rhs.name).
            isEquals();
    }
}