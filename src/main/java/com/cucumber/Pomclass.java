package com.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomclass {
	
	
	//login page
	@FindBy(xpath = "//input[@id='username']")
	public static WebElement userid;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement pwd;
	
	@FindBy(xpath = "//input[@class='login_button']")
	public static WebElement login;
	
	

}
