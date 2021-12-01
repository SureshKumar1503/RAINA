package Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import raina.propertiesUtility;

public class LoginUsingProperties {

	@Test
	public void loginproperties() throws IOException{
		 propertiesUtility pu=new propertiesUtility();
		String u = pu.readDataFromProperty("url");
		String un = pu.readDataFromProperty("username");
		String pwd = pu.readDataFromProperty("pasword");
		
		WebDriver driver=new ChromeDriver();
		driver.get(u);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		
	}
}
