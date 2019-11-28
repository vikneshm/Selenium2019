package com.testCucumber.LoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLogin {
	
	WebDriver driver;
	
	 public POMLogin(WebDriver driver){
		 PageFactory.initElements(driver,this);
		
	}
	 
	 @FindBy(id="userName")
	 public static WebElement username;
	 @FindBy(id="password")
	 public static WebElement password;
	 @FindBy(name="Login")
	 public static WebElement login;
	 
	 

}
