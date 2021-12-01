package TestNg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class TestVtiger {
	public WebDriver driver;
@BeforeTest
	public void connectDB() throws SQLException {
		
	
	String url = "jdbc:mysql://localhost:3306/testyantra";
	String un = "root";
	String pwd = "root";
	
	Driver driverRef=new Driver();
	DriverManager.registerDriver(driverRef);
	
	Connection con = DriverManager.getConnection(url,un,pwd);
	Statement stmt = con.createStatement();
	}


	@BeforeClass
				
	public void openapp() {
	 driver = new  ChromeDriver();
	driver.manage().window().maximize();
	}

	@BeforeMethod	
public void login() { 

	
 driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
}


	@Test
	
		public void tc1() {
			driver.findElement(By.name("lastname")).sendKeys("suresh");
			driver.findElement(By.name("company")).sendKeys("testyantra");
			WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
			redio.click() ;	
	}


@AfterMethod
	public void closeapp() {
	 	
		  WebElement ele1 = driver.findElement(By.xpath("(//td[@class=\"small\"])[2]"));
	        Actions action = new Actions(driver);
	        action.moveToElement(ele1).perform();
	        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	      
	       
		
	}   
@AfterClass
public void quite() {
	
	 driver.quit();
}
}
