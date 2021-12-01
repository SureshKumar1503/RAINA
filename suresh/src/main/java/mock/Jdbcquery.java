package mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Jdbcquery {

	public static void main(String[] args) throws SQLException {
		
	    Driver driver;
		driver =new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra","root","root");
		Statement stmt = con.createStatement();
                     String quary = "select*from RAINA;";
                     ResultSet result = stmt.executeQuery(quary);
           
          while(result.next())
          {
        	  System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
        	  
          }
	}
	
    
}



