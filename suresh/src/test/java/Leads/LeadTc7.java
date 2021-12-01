package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.BaseclassUtility;
import BaseOfwebdriver.WebDriverUtility;

	public class LeadTc7 extends BaseclassUtility{
		WebDriverUtility wd=new WebDriverUtility();
		
		@Test
		public void Tc6(){
			driver.findElement(By.name("lastname")).sendKeys("noah");
			driver.findElement(By.name("company")).sendKeys("testyantra");
			
			WebElement ele = driver.findElement(By.name("industry"));
			ele.click();
		   // Select s=new Select(ele);
		  //  s.selectByValue("Banking");
			String text = "Banking";
			wd.select(ele, text);
			
			WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
			redio.click() ;
			
			WebElement ele2 = driver.findElement(By.name("leadsource"));
			ele2.click();
			//Select s2 =new Select(ele2);
			//s2.selectPartnerByValue("Partner");
			//ele2.click();
			String value = "Partner";
			wd.select(ele2,value);
			driver.findElement(By.name("button")).click();
			
		}

	}



