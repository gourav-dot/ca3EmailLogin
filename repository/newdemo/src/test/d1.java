package test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class d1 extends getdata {
	WebDriver driver;
	
	
	
	@Parameters({"browser"})
	   @BeforeTest
	   public void setUp() {
		String browser="chrome";
	       if(browser.equalsIgnoreCase("chrome")) {
	           WebDriverManager.chromedriver().setup();
	           driver = new ChromeDriver();
	       }
	       else if(browser.equalsIgnoreCase("edge")) {
	           WebDriverManager.edgedriver().setup();
	           driver = new EdgeDriver();
	       }
	      }
	 
	 
	@Parameters({"url"})
	@Test
     public  void test1(String url) throws InterruptedException  {
		  driver.get(url);
		
	       driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
	     
	       driver.findElement(By.xpath("//button[@jsname='LgbsSe']")).click();
	       Thread.sleep(2000);
	      
			
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
			 driver.findElement(By.xpath("//button[@jsname='LgbsSe']")).click();
			 Thread.sleep(2000);
			 
	      
	       WebElement Image = driver.findElement(By.xpath("//a[@class='gb_D gb_Ia gbii']"));
	       Assert.assertTrue(Image.isDisplayed());
	      
		
	}
	
	
	
	  @AfterTest 
	  public void close(){
		  driver.close();
		  }
	
	}