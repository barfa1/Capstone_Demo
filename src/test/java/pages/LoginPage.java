package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import tests.BaseClass;

public class LoginPage {
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
//	==================== WebElements ===================
	
	@FindBy(linkText="Login/Signup")
	WebElement navigate_to_login;
	
	@FindBy(name="email_id")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	
	@FindBy(tagName = "button")
	WebElement login;
	
//	==================== init Elements in Class constructor ==========
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//	================ class Methods =====================
	@Parameters({"UserName","Password"})
	public void Login(String UsernameVal , String Password) {
		
		
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
//		test.log(LogStatus.PASS, "Entered username "+UsernameVal, "Successfully Enetered username");

		password.sendKeys(Password);
//		test.log(LogStatus.PASS, "Entered password "+Password, "Successfully Enetered Password");
		
		
		

		login.click();
//		test.log(LogStatus.PASS, "clicked login button ", "Successfully clicked login button");
		
	}
	
	
	
}
