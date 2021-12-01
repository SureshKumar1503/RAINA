package suresh1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class ActualDataExpect {

	public static void main(String[] args) throws SQLException {
		
		String expectedResult = "SIVA";
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra","root","root");
		 Statement stmt = con.createStatement();
		String quary = "select * from student where stu_name='SIVA'";
		ResultSet result = stmt.executeQuery(quary);
	
		
		
	while(result.next()) {
		String acutalresult = result.getString(1);
	
	//assertEquals(expectedResult, acutalresult);
	if(expectedResult.equals(acutalresult))
	{
	System.out.println("valid");	
	}
	else
	{
		System.out.println("invalid");
	}
	con.close();
	
	}
	
	}

}
