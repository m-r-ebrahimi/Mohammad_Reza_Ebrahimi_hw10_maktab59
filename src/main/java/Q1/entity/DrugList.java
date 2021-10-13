package Q1.entity;

import Q1.manager.DrugListManager;

import java.sql.SQLException;
import java.util.Objects;

public class DrugList implements Methods {
    private int id;
    private int patientId;
    private int drugId;
    private int number;

    public DrugList(int id, int patientId, int drugId, int number) {
        this.id = id;
        this.patientId = patientId;
        this.drugId = drugId;
        this.number = number;
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

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugList drugList = (DrugList) o;
        return id == drugList.id && patientId == drugList.patientId && drugId == drugList.drugId && number == drugList.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, drugId, number);
    }


    @Override
    public <T extends Row> boolean addItem(T item) throws SQLException, ClassNotFoundException {
        return DrugListManager.insert((RowDrugList) item);
    }

    @Override
    public <T> boolean removeItem(T item) {
        return false;
    }

    @Override
    public <T> boolean updateItem(T item) {
        return false;
    }
}
