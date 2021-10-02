package fr.epita.services.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MCQChoiceDAO {
    Connection connection;

    public MCQChoiceDAO() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:h2:./testdb", "root", "root");
    }

    private void createTable(Connection connection) throws SQLException {
        String createStatement = "CREATE TABLE IF NOT EXISTS MCQ (ID INT IDENTITY PRIMARY KEY, Question VARCHAR(255))";

        PreparedStatement preparedStatement = connection.prepareStatement(createStatement);
        preparedStatement.execute();
    }




}


