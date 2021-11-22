package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\cucumber\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"))
			.isDisplayed();
		if(logo == true) {
			System.out.println("Logo is available");
		}	else {
			System.out.println("Logo is not available");
		}
	}
}
