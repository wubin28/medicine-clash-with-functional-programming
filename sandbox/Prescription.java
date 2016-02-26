import java.time.LocalDate;

public class Prescription {
    public LocalDate dispenseDate;
    public int daysSupply;
    public String doctorName;

    public Prescription(LocalDate dispenseDate, int daysSupply, 
        String doctorName) {
    }

    @Override
    public String toString() {
        return "Prescription written on " + this.dispenseDate + 
            " for " + this.daysSupply + " days by " + this.doctorName;
    }
}