package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import raina.propertiesUtility;

public class LogOut  {
	 		public void closeapp(WebDriver driver) {
			  propertiesUtility pp=new propertiesUtility();  	
			  WebElement ele1 = driver.findElement(By.xpath("(//td[@class=\"small\"])[2]"));
		        Actions action = new Actions(driver);
		        action.moveToElement(ele1).perform();
		        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		      
		       
			
		}   
}
