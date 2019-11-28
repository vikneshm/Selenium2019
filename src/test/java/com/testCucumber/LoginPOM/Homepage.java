package com.testCucumber.LoginPOM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="SignIn")
	public static WebElement signin;
	@FindBy(partialLinkText="SignUp")
	public static WebElement signup;
	@FindBy(xpath="//span[Contains(Text(),'All Categories'")
	public static WebElement allcategories;
	@FindBy(xpath="//span[Contains(Text(),'Head Phone'")
	public static WebElement headphone;
	
}
