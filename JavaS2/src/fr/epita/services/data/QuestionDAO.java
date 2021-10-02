package fr.epita.services.data;

import java.sql.*;

public class QuestionDAO {
    Connection connection;

    public QuestionDAO() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:h2:./testdb", "root", "root");
    }

    private void createTable(Connection connection) throws SQLException {
        String createStatement = "CREATE TABLE IF NOT EXISTS QUESTION(ID INT IDENTITY PRIMARY KEY, TITLE VARCHAR(255), DIFFICULTY INT)";

        PreparedStatement preparedStatement = connection.prepareStatement(createStatement);
        preparedStatement.execute();
    }

    public void insertData(Connection connection, String title, int difficulty) throws SQLException {
//        System.out.println("INSERT INTO QUESTION (TITLE, DIFFICULTY) values ('" + title + "', 2)");
        connection.prepareStatement("INSERT INTO QUESTION (TITLE, DIFFICULTY) values ('" + title + "'," + difficulty + ")").execute();

    }

    public void viewData() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM QUESTION");
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            result.getInt("ID");
            result.getString("TITLE");
//            System.out.println("name = " + result.getString("TITLE") + " Difficulty = " + result.getInt("DIFFICULTY"));
        }
    }

    public void deleteData(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM QUESTION WHERE TITLE = 'This is my first question5' ");
        boolean resultSet = statement.execute();
    }
}
