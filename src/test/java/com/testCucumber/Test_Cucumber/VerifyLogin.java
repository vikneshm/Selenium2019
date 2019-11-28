package com.testCucumber.Test_Cucumber;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.testCucumber.LoginPOM.Homepage;
import com.testCucumber.LoginPOM.POMLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class VerifyLogin {
	WebDriver driver;
	
	@Given("user is on home page")
	public void user_is_on_home_page(){
		System.setProperty("webdriver.chrome.driver", "C://selenium demo//seleniumDriver//chromedriver.exe");
	driver=	new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}
	@When("Linda enters the username and password and Click on Login button")
	public void Linda_enters_the_username_and_password_and_Click_on_Login_button(){
		new Homepage(driver);
		Homepage.signin.click();
		//new POMLogin(driver);
		POMLogin.username.sendKeys("Linda123");
		POMLogin.password.sendKeys("password123");
		POMLogin.login.click();


		
	}
	@Then("Linda should be logged in and verified")
	public void Linda_should_be_logged_in_and_verified(){
		String title=driver.findElement(By.xpath("ul[Contains(Text(),'Hi, Linda")).getText();
		Assert.assertEquals(title, "Hi, Linda");
	}
	
	@Given("Navigate to all Categories - electronics and headphone")
	public void navigate_to_all_Categories_electronics_and_headphone(){
		Homepage.allcategories.click();
		Homepage.headphone.click(); 
	}

}
