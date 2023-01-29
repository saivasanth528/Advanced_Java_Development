package database.jdbc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class JDBCPersonDAOTest {
    private PersonDAO personDAO = new JDBCPersonDAO();

    @Test
    public void save() {
        Person p = new Person("Vasanth");
        int generatedId = personDAO.save(p);
        assertNotNull(personDAO.findById(generatedId));
    }
}
