package CRM;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmailCheckbox {

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
        driver.findElement(By.name("accountname")).sendKeys("test2");
        driver.findElement(By.name("emailoptout")).click();
      
       WebElement ele1 = driver.findElement(By.xpath("(//td[@class=\"small\"])[2]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele1).perform();
        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
      
        driver.quit();
        
        
	}

}
