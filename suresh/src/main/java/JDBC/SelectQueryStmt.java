package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryStmt {

	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/testyantra";
		String un = "root";
		String pwd = "root";
	    Driver driver;
		driver =new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection(url,un,pwd);
		Statement stmt = con.createStatement();
                     String quary = "select*from RAINA;";
                     ResultSet result = stmt.executeQuery(quary);
           
          while(result.next())
          {
        	  System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
        	  
          }
	}
	
    
}
