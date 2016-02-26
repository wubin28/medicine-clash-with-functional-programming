import java.time.LocalDate;

public class Prescription {
    public Prescription(LocalDate dispenseDate, int daysSupply, 
        String doctorName) {
    }

    @Override
    public String toString() {
        return "Prescription dispense date is " + this.dispenseDate + "for " + this.daysSupply + " days";
    }
}