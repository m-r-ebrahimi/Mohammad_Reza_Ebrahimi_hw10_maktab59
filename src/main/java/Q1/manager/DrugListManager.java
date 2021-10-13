package Q1.manager;

import Q1.database.DbConnection;
import Q1.database.DbDataSource;
import Q1.entity.RowDrugList;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DrugListManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static Connection connector;
    private static PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private static final String QUERYINSERT = "INSERT INTO drugstore.drug_list (patient_id, drug_id, `number`) VALUES(?, ?, ?);";
    private static final String QUERYDELTE = "DELETE FROM drugstore.drug_list WHERE id?0;";
    private static final String QUERYUPDATE = "UPDATE drugstore.drug_list SET patient_id=?, drug_id=?, `number`=? WHERE id=?;";

    public static boolean insert(RowDrugList row) throws SQLException, ClassNotFoundException {
        if (row == null) {
            return false;
        } else {
            connector = DbConnection.createConnection();
            preparedStatement = connector.prepareStatement(QUERYINSERT);
            preparedStatement.setInt(1, row.getPatient().getId());
            preparedStatement.setInt(2, row.getDrug().getId());
            preparedStatement.setInt(3, row.getNumber());
            preparedStatement.executeUpdate();
            return true;
        }
    }
}
