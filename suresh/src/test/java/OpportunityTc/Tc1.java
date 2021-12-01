package OpportunityTc;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Opportunity.Opportunitybase;

public class Tc1 extends Opportunitybase {
@Test
	public void madatory() {
		driver.findElement(By.name("potentialname")).sendKeys("laptop");
		WebElement ele = driver.findElement(By.id("related_to_type"));
		ele.click();
		Select a =new Select(ele);
		a.selectByValue("Accounts");
		ele.click();
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String ref:child )
		{
			
		driver.switchTo().window(ref);
		}
				
		
		driver.findElement(By.xpath("//a[text()='tcs']")).click();
		
		
		driver.findElement(By.xpath("//inp]ut[@type='submit'")).click();
		
	}
	
}
