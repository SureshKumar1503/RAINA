package CRM;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrganizationClear {

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
        
        driver.findElement(By.xpath("//img[@title='Select']")).click();
       
        String parent = driver.getWindowHandle();
       Set<String> child = driver.getWindowHandles();
       for(String ref:child)
       {
        	
        	driver.switchTo().window(ref);
        }
        
       driver.findElement(By.xpath("//a[text()='testyantra2']")).click();
        Alert popup = driver.switchTo().alert();
        popup.accept();
        driver.switchTo().window(parent);
        
                driver.findElement(By.name("button")).click();
                driver.findElement(By.xpath("//a[text()='Clear']")).click();

}
	
}
