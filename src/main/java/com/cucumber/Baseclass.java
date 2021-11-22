package com.cucumber;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseclass extends Pomclass {

	 public static WebDriver driver;
	 public static Properties pro;
//	 public static TakesScreenshot ts;
	 public static WebDriver Browser(String name) 
	 {
	 		if(name.equalsIgnoreCase("chrome")) {
	 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\cucumber\\Driver\\chromedriver.exe");
	 		driver = new ChromeDriver();
	 	}
	 		else if (name.equalsIgnoreCase("gecko")) {
	 		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
	 		driver = new FirefoxDriver();
	 	}
	 driver.manage().window().maximize();
	 return driver;
}
 
	 public static Properties getProperties() throws Exception {
		 FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\cucumber\\src\\main\\java\\com\\cucumber\\cadactin.properties");
			pro = new Properties();
			pro.load(file);
		return pro;
		 
	 }
	 public static String seturl(String url)
	 	{
	 		driver.get(url);
	 		return(url);
	 	}
	 
	 public static  String Uid(WebElement element, String val) 
	 {
		 element.sendKeys(val);
		 return(val);
	 }
	 
	 public static void Click(WebElement element) 
	 {
		 element.click();
	 }
	 
	 
}
