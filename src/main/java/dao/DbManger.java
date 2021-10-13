package dao;

public interface DbManger {
    <T> boolean addItem(T object);
    boolean removeItem(String className, int id);
    <T>boolean update(T object);
}
