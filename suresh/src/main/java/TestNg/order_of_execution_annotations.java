package TestNg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class order_of_execution_annotations {
	
	
	
	@BeforeTest
	public void connect()
	{
		System.out.println("connect to database");
	}
	
	@BeforeClass()
	public void browser()
	{
		System.out.println("Open Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	
	@Test
	public void monday()
	{
	System.out.println("monday");	
	}
	
	@Test
	public void tuesday()
	{
		System.out.println("tuesday");
	}
	
	@Test
	public void wednesday()
	{
		System.out.println("wednesday");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	@AfterClass
	public void close_browser()
	{
		System.out.println("close  browser");
	}
	
	@AfterTest
	public void db_close()
	{
		System.out.println("close database");
	}

}