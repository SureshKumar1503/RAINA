package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseclassUtility;

public class Lead_All_Test extends BaseclassUtility {
	@Test
	public void tc1() {
		
		driver.findElement(By.name("lastname")).sendKeys("suresh");
		driver.findElement(By.name("company")).sendKeys("testyantra");
		WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
		redio.click() ;
		}

		@Test
			public void industri_Tc2() {
				WebElement tc2 = driver.findElement(By.name("industry"));
				tc2.click();
			}
		@Test
		public void tc3() {
			WebElement ele = driver.findElement(By.name("industry"));
			ele.click();
			
			Select s=new Select(ele);
		    //s.selectByVisibleText("Insurance");
			s.selectByValue("Insurance");
			ele.click();
		}
		@Test
		public void Tc4() {
			driver.findElement(By.name("lastname")).sendKeys("suresh");
			driver.findElement(By.name("company")).sendKeys("testyantra");
			driver.findElement(By.name("designation")).sendKeys("SOFTWAREtESTER");
			WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
			redio.click() ;
			WebElement ele = driver.findElement(By.name("industry"));
			ele.click();
			
			Select s=new Select(ele);
		    //s.selectByVisibleText("Insurance");
			s.selectByValue("Insurance");
			ele.click();
			
			driver.findElement(By.name("button")).click();
			
		}
		@Test
		public void Tc6(){
			driver.findElement(By.name("lastname")).sendKeys("noah");
			driver.findElement(By.name("company")).sendKeys("testyantra");
			
			WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		    Select s=new Select(ele);
		    s.selectByValue("Insurance");
			ele.click();
			WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
			redio.click() ;
			
			WebElement ele2 = driver.findElement(By.name("leadsource"));
			ele2.click();
			Select s2 =new Select(ele2);
			s2.selectByValue("Partner");
			ele2.click();
			driver.findElement(By.name("button")).click();
			
		}

		}

