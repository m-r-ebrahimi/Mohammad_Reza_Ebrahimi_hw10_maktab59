package entity;

import dao.DbManger;

public class Patient extends Person implements DbManger {
    private int balance;

    public Patient(int id, String name, int balance) {
        super(id, name);
        this.balance = balance;
    }

    @Override
    public <T> boolean addItem(T object) {
        return false;
    }

    @Override
    public boolean removeItem(String className, int id) {
        return false;
    }

    @Override
    public <T> boolean update(T object) {
        return false;
    }
}
