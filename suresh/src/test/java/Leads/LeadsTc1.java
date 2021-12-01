package Leads;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseclassUtility;
import LeadSBASE.LeadsClass;

public class LeadsTc1 extends BaseclassUtility {
	
	@Test
	public void tc1() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("suresh");
		driver.findElement(By.name("company")).sendKeys("testyantra");
		WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
		redio.click() ;
		//driver.quit();
	//	LeadsTc1 leads = new LeadsTc1();
		//leads.openapp();
		
	}
	}