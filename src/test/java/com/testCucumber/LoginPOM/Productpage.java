package com.testCucumber.LoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	WebDriver driver;
	public Productpage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

}
