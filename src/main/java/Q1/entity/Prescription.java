package Q1.entity;

import java.util.Objects;

public class Prescription {
    private int id;
    private int patientId;
    private int DrugListId;

    public Prescription(int id, int patientId, int drugListId) {
        this.id = id;
        this.patientId = patientId;
        DrugListId = drugListId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDrugListId() {
        return DrugListId;
    }

    public void setDrugListId(int drugListId) {
        DrugListId = drugListId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return id == that.id && patientId == that.patientId && DrugListId == that.DrugListId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, DrugListId);
    }
}
