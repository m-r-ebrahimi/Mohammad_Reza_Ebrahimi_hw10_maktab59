package Q1.entity;

import Q1.manager.DrugListManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DrugList implements Methods {
    private int id;
    private Person patient;
    private List<Drug> drugs = new ArrayList<Drug>(10);

    public DrugList(Person patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    @Override
    public <T extends Row> boolean addItem(T item) throws SQLException, ClassNotFoundException {
        if (drugs.size() >= 10) {
            System.out.println("Your list is full. try another list.");
            return false;
        } else {
            drugs.add(((RowDrugList) item).getDrug());
            DrugListManager.insert((RowDrugList) item);
            return true;
        }
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
