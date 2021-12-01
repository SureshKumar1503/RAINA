package OpportunityTc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Opportunity.Opportunitybase;

public class Tc02 extends Opportunitybase {
 @Test
	public void contect()  {
	
	 driver.findElement(By.name("potentialname")).sendKeys("laptop");
		WebElement ele = driver.findElement(By.id("related_to_type"));
		ele.click();
		Select a =new Select(ele);
		a.selectByValue("Contacts");
		ele.click();
		driver.findElement(By.name("button")).click();
	}
}
