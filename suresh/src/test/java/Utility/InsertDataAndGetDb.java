package Utility;

import java.sql.SQLException;

import org.testng.annotations.Test;

import raina.DButility;



public class InsertDataAndGetDb {
@Test
	public void tc1() throws SQLException {
		DButility dbutil=new DButility();
		dbutil.ConnectToDatabase();
		
		dbutil.executeToQueryAndFetchtheData("select *from student where stu_name='raina'",1,"raina");
	}
}
