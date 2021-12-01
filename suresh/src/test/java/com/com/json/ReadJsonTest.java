package com.com.json;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import raina.JsonUtility;

public class ReadJsonTest {
@Test
	public void ReadLogindata() throws IOException, ParseException {
		JsonUtility pf=new JsonUtility();
		String url = pf.jsonfile("URL");
		String un = pf.jsonfile("un");
		String pwd = pf.jsonfile("PWD");
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       driver.get(url);
	       driver.findElement(By.name("username")).sendKeys(un);
	       driver.findElement(By.name("password")).sendKeys(pwd);
	            
	}
}
