package database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCPersonDAO implements PersonDAO {

    private static final String DRIVER = "com.sql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/hr";
    private static final String USER = "root";
    private static final String PASSWORD = "Vasanth@28";

    // https://stackoverflow.com/a/19837588/7408451
    public JDBCPersonDAO() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person findById(Integer id) {
        Person person = null;
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement =
                        connection.prepareStatement("SELECT * FROM hr.PEOPLE WHERE id = ?")
                )   {
                        preparedStatement.setInt(1, id);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if (resultSet.next()) {
                            person = new Person(id, resultSet.getString("name"));
                        }
                        resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public Integer save(Person p) {
        int generatedKey = 0;
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "INSERT INTO hr.PEOPLE(name) VALUES(?)",
                        Statement.RETURN_GENERATED_KEYS)
        )
        {
            preparedStatement.setString(1, p.getName());
            int count = preparedStatement.executeUpdate();
            if (count != 1) {
                throw new SQLException("No Rows added");
            }

            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                if (keys.next()) {
                    generatedKey = keys.getInt(1);
                }
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
        return generatedKey;
    }

    @Override
    public void delete(Person p) {

    }

    @Override
    public List<Integer> getIds() {
        return null;
    }
}
