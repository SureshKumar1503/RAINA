package raina;

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.JSONParser;
	import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import Base.IpathConstants;

	public class JsonUtility  {
		@BeforeMethod
		public String jsonfile(String key) throws IOException, ParseException {
		FileReader fr = new FileReader(IpathConstants.jsonfile);
	    JSONParser jp = new JSONParser(); 
	   Object javaobj = jp.parse(fr);
	   HashMap map = (HashMap) javaobj;
	  String value= (String) map.get(key);
	  return value;
	  
	  
	   
		}
	}

