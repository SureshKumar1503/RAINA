package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateQuary {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/testyantra";
		String un = "root";
		String pwd = "root";
Driver driverRef=new Driver();
DriverManager.registerDriver(driverRef);
Connection con = DriverManager.getConnection(url,un,pwd);
Statement stmt = con.createStatement();
int result = stmt.executeUpdate("CREATE TABLE STUDENT11(STU_NAME VARCHAR(25) NOT NULL, STU_ID int, DEPARTMENT VARCHAR(20) NOT NULL, PRIMARY KEY(STU_ID));");
if(result==0)
	System.out.println("table created succesfully");
else
	System.out.println("quary not ok ");
con.close();
	}
}