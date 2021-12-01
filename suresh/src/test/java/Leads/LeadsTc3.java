package Leads;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseclassUtility;
import LeadSBASE.LeadsClass;

@Test
public class LeadsTc3 extends BaseclassUtility {

	public void tc3() {
		WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		
		Select s=new Select(ele);
	    //s.selectByVisibleText("Insurance");
		s.selectByValue("Insurance");
		ele.click();
	}
}
