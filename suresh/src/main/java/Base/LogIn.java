package Base;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import raina.propertiesUtility;

public class LogIn  {
	
	public void loginTest(WebDriver driver) throws IOException 
	{
	
	propertiesUtility pp=new propertiesUtility();
   driver.get(pp.readDataFromProperty("url"));
   driver.findElement(By.name("user_name")).sendKeys(pp.readDataFromProperty("username"));
   driver.findElement(By.name("user_password")).sendKeys(pp.readDataFromProperty("pasword"));
   driver.findElement(By.id("submitButton")).click();
   
   driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();

}
}