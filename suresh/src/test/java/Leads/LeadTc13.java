package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import LeadSBASE.LeadsClass;

public class LeadTc13 extends LeadsClass{
	@Test(groups = {"ST"} )
	public void Tc10(){
		driver.findElement(By.name("lastname")).sendKeys("vegnesh");
		driver.findElement(By.name("company")).sendKeys("testyantra");
		driver.findElement(By.name("annualrevenue")).sendKeys("1000000");
		driver.findElement(By.name("noofemployees")).sendKeys("8");
		WebElement ele = driver.findElement(By.name("industry"));
	ele.click();
	    Select s=new Select(ele);
	    s.selectByValue("Banking");
		ele.click();
		
		
		WebElement ele2 = driver.findElement(By.name("leadsource"));
		ele2.click();
		Select s2 =new Select(ele2);
		s2.selectByValue("Employee");
		ele2.click();
		WebElement ele3 = driver.findElement(By.name("leadstatus"));
		ele3.click();
		Select s3 =new Select(ele3);
		s3.selectByValue("Cold");
		ele3.click();
		WebElement ele4 = driver.findElement(By.name("rating"));
		ele4.click();
		Select s4 =new Select(ele4);
		s4.selectByValue("Active");
		ele4.click();
		
		
		WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
		redio.click() ;
		WebElement ele5 = driver.findElement(By.name("assigned_group_id"));
		ele5.click();
		Select s5=new Select(ele5);
		s5.selectByValue("4");
		ele5.click();
		
		driver.findElement(By.name("button")).click();
	}

}
