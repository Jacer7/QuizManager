import javax.swing.border.TitledBorder;
import java.security.Principal;
import java.sql.*;

public class TestJDBC1 {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:./testdb", "root", "root");
        String schema = connection.getSchema();
        System.out.println(schema);

//
        // Create Table


//        String createStatement = "CREATE TABLE IF NOT EXISTS QUESTION(ID INT IDENTITY PRIMARY KEY, TITLE VARCHAR(255), DIFFICULTY INT)";
//
//        PreparedStatement preparedStatement = connection.prepareStatement(createStatement);
//        preparedStatement.execute();

//
//        String insertStatement =  "INSERT INTO QUESTION(TITLE, DIFFICULTY) VALUES (?, ?)";
//        PreparedStatement insert = connection.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);
//        insert.setString(1, "What is a javadoc comment?");
//        insert.setInt(2, 3);
////        insert.setString(3, "What is inheritance?");
//        insert.execute();

//        String selectStatement = "SELECT * FROM QUESTION(ID, TITLE, DIFFICULTY) VALUES(?, ?, ?)";
//
//        PreparedStatement select = connection.prepareStatement(selectStatement);
//        ResultSet resultSet = select.executeQuery();
//
//        while (resultSet.next()){
//            resultSet.getInt("ID");
//            resultSet.getInt("DIFFICULTY");
//            resultSet.getString("TITLE");
//
//        }

// Methods
        createTable(connection); // Create dbTable

        for (int i = 0; i < 10; i++) {
            insertData(connection, "This is my first question" + i, i % 2 == 0 ? 2 : 4);
        } // insert data in dbTable
        viewData(connection); // view dbTable data
        deleteData(connection);


    }




    private static void createTable(Connection connection) throws SQLException {
        String createStatement = "CREATE TABLE IF NOT EXISTS QUESTION(ID INT IDENTITY PRIMARY KEY, TITLE VARCHAR(255), DIFFICULTY INT)";

        PreparedStatement preparedStatement = connection.prepareStatement(createStatement);
        preparedStatement.execute();
    }

    private static void insertData(Connection connection, String title, int difficulty) throws SQLException {
//        System.out.println("INSERT INTO QUESTION (TITLE, DIFFICULTY) values ('" + title + "', 2)");
        connection.prepareStatement("INSERT INTO QUESTION (TITLE, DIFFICULTY) values ('" + title + "'," + difficulty + ")").execute();

    }

    private static void viewData(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM QUESTION");
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            result.getInt("ID");
            result.getString("TITLE");
            System.out.println("name = " + result.getString("TITLE") + " Difficulty = " + result.getInt("DIFFICULTY"));
        }
    }

    private static void deleteData(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM QUESTION WHERE TITLE = 'This is my first question5' ");
        boolean resultSet = statement.execute();
    }




















}

