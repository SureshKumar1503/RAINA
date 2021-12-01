package Utility;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import raina.JsonUtility;

public class jsonreadLogin {
@Test	 
	public void loginjson() throws IOException, ParseException {
		JsonUtility ju= new JsonUtility();
		String url = ju.jsonfile("URL");
		String un = ju.jsonfile("un");
		String PWD = ju.jsonfile("PWD");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(PWD);
	} 

}


