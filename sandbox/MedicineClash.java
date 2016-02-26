import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class MedicineClash {
    public static List<Customer> of(
            List<Customer> customers,
            long daysBeforeToday, 
            LocalDate now) {

        // TODO: cover the following
        return customers.stream()
            .filter(customer -> customer.medicines.size() == 2 &&
                ((customer.medicines.get(0).name == "Codeine" &&
                    customer.medicines.get(1).name == "Prozac") ||
                 (customer.medicines.get(0).name == "Prozac" &&
                    customer.medicines.get(1).name == "Codeine")
                ) &&
                customer.medicines.get(0).prescriptions.size() >= 1 &&
                customer.medicines.get(1).prescriptions.size() >= 1
            )
            .filter(customer -> 
                MedicineClash.isOverlapped(customer, daysBeforeToday, now))
            .collect(Collectors.toList());
    }

    public static boolean isOverlapped(
            Customer customer,
            long daysBeforeToday, 
            LocalDate now) {
        LocalDate startA = customer.medicines.get(0).;
        LocalDate endA = getEndDate(medicine);
        LocalDate startB = getStartDate(clashingMedicine);
        LocalDate endB = getEndDate(clashingMedicine);
        
        return !(startA.isAfter(endB) || endA.isBefore(startB)) 
            ? true : false;
    }
}