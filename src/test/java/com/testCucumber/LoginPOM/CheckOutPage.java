package com.testCucumber.LoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	WebDriver driver;
	public CheckOutPage(WebDriver drievr){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='Proceed to Pay']")
	public static WebElement proceedToPay;
	@FindBy(id="btn")
	public static WebElement continuetopay;
	@FindBy(xpath="//lable[Contains(Text(),'Andhra Bank')]")
	public static WebElement bankname;
	@FindBy(name="username")
	public static WebElement bankusername;
	@FindBy(name="password")
	public static WebElement bankPasword;
	@FindBy(xpath="//input[@value='LOGIN']")
	public static WebElement Loginbutton;
	

}
