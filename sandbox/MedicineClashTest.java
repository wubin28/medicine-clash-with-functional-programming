import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class MedicineClashTest {

    // GOAL: To find the a collection of days on which all the 
    //       given two clashed medicines were being taken during 
    //       a given period of time (defaults to the last 90 days).

    // User story: As a Health Insurer,
    //             I want to be able to search for patients who have 
    //                 a medicine clash,
    //             So that I can alert their doctors and get their 
    //                 prescriptions changed.

    // ID, CustomerName, Medicine, DispenseDate, daysSupply, DoctorName
    // Customer(ID, Name, -Medicine-, -DispenseDate-, -daysSupply-, -DoctorName-)
    //         \
    //         *\
    //         Medicine(Name, -DispenseDate-, -daysSupply-, -DoctorName-)
    //            /
    //          */
    //         Prescription(DispenseDate, daysSupply, DoctorName)

    @Test
    public void no_clash_when_not_taking_both_medicines() {
        List<Customer> customers = new ArrayList<>();
        List<Medicine> medicines = new ArrayList<>();
        List<Prescription> prescriptions = new ArrayList<>();

        prescriptions.add(
            new Prescription(LocalDate.now().minusDays(30), 
                30, "Jason"));
        medicines.add(new Medicine("Codeine", prescriptions));
        customers.add(
            new Customer("110101197010104510", "Ben", 
                medicines));
        
        assertEquals(new ArrayList<Customer>(), MedicineClash.of(customers));
    }

    // TODO: no_clash_when_no_overlap() {
    // TODO: two_medicines_taken_in_a_partially_overlapping_period
    // TODO: two_medicines_taken_overlapping_start_of_period
    // TODO: two_medicines_taken_overlapping_current_date
    // TODO: clash_when_medicines_taken_continuously
    // TODO: clash_when_one_medicine_taken_on_some_of_the_days
}