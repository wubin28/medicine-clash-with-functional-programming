import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class MedicineClash {
    public static List<Customer> of(
            List<Customer> customers,
            long daysBeforeToday, 
            LocalDate now) {

        // TODO: tests covering the following
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
        LocalDate startA = 
            customer.medicines.get(0).prescriptions.get(0).dispenseDate;
        LocalDate endA = 
            customer.medicines.get(0).prescriptions.get(0).dispenseDate
                .plusDays(customer.medicines.get(0).prescriptions.get(0).daysSupply);
        LocalDate startB = 
            customer.medicines.get(1).prescriptions.get(0).dispenseDate;
        LocalDate endB = 
            customer.medicines.get(1).prescriptions.get(0).dispenseDate
                .plusDays(customer.medicines.get(1).prescriptions.get(0).daysSupply);
        
        return !(startA.isAfter(endB) || endA.isBefore(startB)) 
            ? true : false;
    }
}