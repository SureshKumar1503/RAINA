package suresh1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ReadDataFromPropertyFile {
	public static void main(String[]args) throws IOException {
	FileInputStream fis =new FileInputStream("./commandatafile.txt");
	Properties p=new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	String brw = p.getProperty("browser");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	System.out.println(URL);
	System.out.println(brw);
	System.out.println(un);
	System.out.println(pwd);
	p.setProperty("URL", "www.instagram");
	p.setProperty("UN","window");
	p.setProperty("PWD","microsoft");
	p.setProperty("BROWSER","INERNET EXPLORE");
	FileOutputStream fos = new FileOutputStream	("./commandatafile.txt");
	p.save(fos, null);
	//if(brw.equals("chrome")){
	//System.out.println("browser is chrome");
	//WebDriver driver=new ChromeDriver();
	//}
	//else if(brw.equals("firefox")) {
	//	System.out.println("browser is firefox");
	//	WebDriver driver=new FirefoxDriver();
		
	//}
	
	}


}