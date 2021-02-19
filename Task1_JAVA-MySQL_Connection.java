
import java.util.*;  
import java.sql.*;
public class Okok {

    public static void main(String[] args) throws ClassNotFoundException {
        try
        {
            String query = "SELECT * FROM employee";
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curddatabase", "root", "")) {
                Statement st = conn.createStatement();
                
                ResultSet rs = st.executeQuery(query);
		boolean flag = false;
		while(rs.next())
		{
                    System.out.println("now");
			flag = true;
			System.out.println( rs.getString(1)+ "\t" +rs.getString(2));
		}
		if(flag == false)
		{
			System.out.println("SORRY!!! No Records Found");
		}
		
             conn.close();
            
        }
            }
        catch(SQLException e)
        {
            e.getStackTrace();
           
        }
        
    }
    
}
