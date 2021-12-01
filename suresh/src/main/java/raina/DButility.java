package raina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.BeforeMethod;

import com.mysql.cj.jdbc.Driver;

import Base.IpathConstants;

public class DButility {
	
	Connection con;
	public void  ConnectToDatabase() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con  = DriverManager.getConnection(IpathConstants.Jdbcpath,IpathConstants.jdbcUn,IpathConstants.jdbcPwd);
	}
	public void executeToQueryAndFetchtheData(String query,int colindex,String expdata) throws SQLException {
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag=false;
		
		while(result.next()) {
			String actual = result.getString(colindex);
			
		if(actual.equalsIgnoreCase(expdata)) {
			System.out.println("valid data");
			flag=true;
			break;
		}else {
			System.out.println("invalid data");
		}	
		}
		}
	public void closeDB() throws SQLException {
		con.close();
	}	
	 }
		
