package Q1.entity;

public class RowDrugList extends Row{
    private Patient patient;
    private Drug drug;
    private int number;

    public RowDrugList(Patient patient, Drug drug, int number) {
        this.patient = patient;
        this.drug = drug;
        this.number = number;
    }

    public Patient getPatient() {
        return patient;
    }

    public Drug getDrug() {
        return drug;
    }

    public int getNumber() {
        return number;
    }
}
