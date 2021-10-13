package Q1.entity;

import java.sql.SQLException;

public interface Methods {
    <T extends Row> boolean addItem(T item) throws SQLException, ClassNotFoundException;
    <T> boolean removeItem(T item);
    <T> boolean updateItem(T item);
}
