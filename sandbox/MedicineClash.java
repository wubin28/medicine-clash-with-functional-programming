import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class MedicineClash {
    public static Set<Customer> of(Set<Customer> customers) {
        return customers.stream()
            .filter(customer -> customer.medicines.size() == 1)
            .collect(Collectors.toSet());
    }
}