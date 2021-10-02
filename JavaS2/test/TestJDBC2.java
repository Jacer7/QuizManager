import java.sql.*;

public class TestJDBC2 {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:./testdb", "root", "root");
        String schema = connection.getSchema();
        System.out.println(schema);

        createTable(connection);
        insertData1(connection);
        viewData1(connection);

    }


    private static void createTable(Connection connection) throws SQLException {
        String createStatement = "CREATE TABLE IF NOT EXISTS MCQChoice(ID INT IDENTITY PRIMARY KEY, TITLE VARCHAR(255), DIFFICULTY INT)";
        PreparedStatement preparedStatement = connection.prepareStatement(createStatement);
        preparedStatement.execute();
    }

    private static void insertData1(Connection connection) throws SQLException {
        PreparedStatement insert = connection.prepareStatement("INSERT INTO MCQChoice (TITLE, DIFFICULTY) values (?, ? )");
        insert.setString(1, "What is OOP?");
        insert.setInt(2, 2);

    }

    private static void viewData1(Connection connection) throws  SQLException{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM MCQChoice");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                result.getInt("ID");
                result.getString("TITLE");
                System.out.println("name = " + result.getString("TITLE") + " Difficulty = " + result.getInt("DIFFICULTY"));
            }


        }


    }




