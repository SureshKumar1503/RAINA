package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseclassUtility;
import LeadSBASE.LeadsClass;

public class LeadsTc2 extends BaseclassUtility {
@Test
	public void industri() {
		WebElement tc2 = driver.findElement(By.name("industry"));
		tc2.click();
	}
}
