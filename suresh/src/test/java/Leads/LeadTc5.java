package Leads;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import LeadSBASE.LeadsClass;

public class LeadTc5 extends LeadsClass{
@Test	
public void Tc5() {
	
	driver.findElement(By.name("button")).click();
}
}
