import org.junit.*;
import static org.junit.Assert.*;

public class MedicineClashTest {

    // GOAL: To find the a collection of days on which all the 
    //       given two clashed medicines were being taken during 
    //       a given period of time (defaults to the last 90 days).

    // User story: As a Health Insurer,
    //             I want to be able to search for patients who have 
    //                 a medicine clash,
    //             So that I can alert their doctors and get their 
    //                 prescriptions changed.

    // TODO: no_clash_when_not_taking_both_medicines
    // TODO: no_clash_when_no_overlap
    // TODO: two_medicines_taken_in_a_partially_overlapping_period
    // TODO: two_medicines_taken_overlapping_start_of_period
    // TODO: two_medicines_taken_overlapping_current_date
    // TODO: clash_when_medicines_taken_continuously
    // TODO: clash_when_one_medicine_taken_on_some_of_the_days

    @Test
    public void should() {
        assertEquals(1, 1);
    }
}