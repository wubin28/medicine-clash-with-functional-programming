import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class MedicineClash {
    public static List<Customer> of(
            List<Customer> customers,
            long daysBeforeToday, 
            LocalDate now) {
        return customers.stream()
            .peek(customer -> System.out.println(customer))
            .filter(customer -> customer.medicines.size() == 2)
            .peek(customer -> System.out.println(customer))
            .filter(customer -> 
                MedicineClash.isOverlapped(customer, daysBeforeToday, now))
            .collect(Collectors.toList());
    }

    public static boolean isOverlapped(
            Customer customer,
            long daysBeforeToday, 
            LocalDate now) {
        return false;
    }
}