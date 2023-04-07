package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;

public class getdata {
	   public WebDriver driver;
	  
	   public Properties prop;
	   protected String username;
	   protected String password;
	    
	   @BeforeClass
	   public void setUp() throws IOException {
	       prop = new Properties();
	       
	       FileInputStream ip = new FileInputStream("C:/Users/dell/git/repository/newdemo/main/config.properties");
	       prop.load(ip);
	       username = prop.getProperty("username");
	       password = prop.getProperty("password");
	   }
}