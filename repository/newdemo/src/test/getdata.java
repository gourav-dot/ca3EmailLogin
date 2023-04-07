package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class getdata {
	  
	  
	  
	   protected String username;
	   protected String password;
	    
	   @BeforeTest
	   public void setUp() throws IOException {
	      Properties prop = new Properties();
	       
	       FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "src/config.properties");
	       prop.load(ip);
	       username = prop.getProperty("username");
	       password = prop.getProperty("password");
	   }
}