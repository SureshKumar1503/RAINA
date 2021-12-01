package com.crm.train;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	@Test(dataProvider="bookTicketsdata")
	
	public void dataprovider(String src,String Dest) 
	{
	System.out.println("from"+src+ "to" +Dest);
	System.out.println("Have A Good Day");
	}

	@DataProvider  Object[][] bookTicketsdata()
	{
	
		Object[][] obj = new Object[5][2];
		
		obj[0][0]="chennai";
		obj[0][1]="bangalore";
		
		obj[1][0]="chennai";
		obj[1][1]="madurai";
		
		obj[2][0]="chennai";
		obj[2][1]="paramakudi";
		
		obj[3][0]="chennai";
		obj[3][1]="trichy";
		
		obj[4][0]="chennai";
		obj[4][1]="kanchi";
		return obj;
		
				
	
	
	
	}
}
