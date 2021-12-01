package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import LeadSBASE.LeadsClass;

public class LeadTc4 extends LeadsClass {
@Test
	public void Tc4() {
	driver.findElement(By.name("lastname")).sendKeys("suresh");
	driver.findElement(By.name("company")).sendKeys("testyantra");
	driver.findElement(By.name("designation")).sendKeys("SOFTWAREtESTER");
	WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
	redio.click() ;
	WebElement ele = driver.findElement(By.name("industry"));
	ele.click();
	
	Select s=new Select(ele);
    //s.selectByVisibleText("Insurance");
	s.selectByValue("Insurance");
	ele.click();
	
	driver.findElement(By.name("button")).click();
	
}
}