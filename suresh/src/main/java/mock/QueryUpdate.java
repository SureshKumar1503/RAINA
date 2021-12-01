package mock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class QueryUpdate {

	public static void main(String[] args) throws SQLException {
		 Driver driver;
			driver =new Driver();
			DriverManager.registerDriver(driver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra","root","root");
			Statement stmt = con.createStatement();
	        int result = stmt.executeUpdate("INSERT INTO RAINA(STU_NAME,STU_ID,DEPARTMENT)VALUES('SURESHRAIAN',8754,'ECE')");
	        if(result==0) {
	        	System.out.println("INSERT DATA table ");
	        }
	        else {
	        	System.out.println("DATA INSERT");
	        }
	        
	
	}

}
