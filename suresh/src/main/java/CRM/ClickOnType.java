package CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickOnType {

	public static void main(String[] args) {
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.id("submitButton")).click();
     
        driver.findElement(By.xpath("//a[text()='Organizations']")).click();
        driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
        driver.findElement(By.name("accountname")).sendKeys("testyantra");
        WebElement type = driver.findElement(By.name("accounttype"));
        Select s=new Select(type);
        s.selectByValue("Analyst");
        driver.findElement(By.name("button")).click();
        
	}

}
