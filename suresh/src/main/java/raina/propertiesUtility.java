package raina;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import Base.IpathConstants;

public class propertiesUtility {
  @AfterMethod
	public String  readDataFromProperty(String key) throws IOException {
		FileInputStream fis =new FileInputStream(IpathConstants.properties);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
}
}