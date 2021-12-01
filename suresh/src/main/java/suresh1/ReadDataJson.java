package suresh1;

import java.io.FileReader;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ReadDataJson {

	public static void main(String[] args) throws Exception {
		//FileReader fr=new FileReader("C:\\Users\\Siva\\eclipse-workspace\\suresh\\1.json");
		FileReader fr = new FileReader("./config.json");
         JSONParser jp = new JSONParser(); 
        Object javaobj = jp.parse(fr);
        HashMap map = (HashMap) javaobj;
       String url = map.get("URL").toString();
       String un = map.get("un").toString();
       String pwd = map.get("PWD").toString();
       
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get(url);
       driver.findElement(By.name("username")).sendKeys(un);
       driver.findElement(By.name("password")).sendKeys(pwd);
            
	}
}