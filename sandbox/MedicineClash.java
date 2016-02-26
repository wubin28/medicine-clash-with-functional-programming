import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class MedicineClash {
    public static List<Customer> of(List<Customer> customers,
            long daysBeforeToday, LocalDate now) {
        return customers.stream()
            .filter(customer -> customer.medicines.size() == 2)
            .filter(customer -> customer.medicines.size() == 2)
            .collect(Collectors.toList());
    }
}