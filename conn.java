package atm.simulator;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///project1","root","Nikhil@132");
            s=c.createStatement();
        }
            catch(Exception e)
            {
                e.printStackTrace();
                System.out.println(e);
            }
        
    }
    
}
