package Base;

import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import BaseOfwebdriver.WebDriverUtility;
import raina.DButility;
import raina.excelutility;
import raina.propertiesUtility;

public class BaseclassUtility

{
	public WebDriver driver;

	DButility db = new DButility();
	excelutility xl = new excelutility();
	propertiesUtility pp = new propertiesUtility();
	WebDriverUtility wd = new WebDriverUtility();
	LogIn lg = new LogIn();
	LogOut lgo = new LogOut();

	@BeforeSuite
	public void dbconnect() throws SQLException {

		System.out.println("data base connection");
		db.ConnectToDatabase();
	}

	@BeforeClass
	public void configWebDrive() {
		System.out.println("****webdriver browser connection*****");
		driver = new ChromeDriver();
		wd.waitUntilPageLoad(driver);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void login() throws IOException {
		lg.loginTest(driver);
	}

	@AfterMethod
	public void logout() {
		lgo.closeapp(driver);
	}

	@AfterClass
	public void webclose() {
		System.out.println("close browser");
		driver.close();

	}

	@AfterSuite
	public void closeconnection() throws SQLException {
		db.closeDB();
	}
}
