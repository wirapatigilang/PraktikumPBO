import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * FIle : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 * 
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo","root","");
        
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        con.close();
    }
}
