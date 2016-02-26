import java.util.List;

public class Medicine {
    public String name;
    public List<Prescription> prescriptions;

    public Medicine(String name, List<Prescription> prescriptions) {
        this.name = name;
        this.prescriptions = prescriptions;
    }

    @Override
    public String toString() {
        return "Medicine " + this.name + " with prescriptions " + this.prescriptions;
    }
}