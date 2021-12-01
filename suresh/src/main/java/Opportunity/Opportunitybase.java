package Opportunity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Opportunitybase {
			public WebDriver driver;
		@BeforeMethod
		public void openapp() {
		driver= new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
	}
}
