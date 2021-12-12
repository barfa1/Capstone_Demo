package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import tests.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;

//	==================== WebElements ===================
	
	@FindBy(linkText="Login/Signup")
	WebElement navigate_to_login;
	
	@FindBy(name="email_id")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	
	@FindBy(tagName = "button")
	WebElement login;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
//	==================== init Elements in Class constructor ==========
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//	================ class Methods =====================
	@Parameters({"UserName","Password"})
	public void Login(String UsernameVal , String Password) {
		
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
		password.sendKeys(Password);
		login.click();
		
	}
	
	@Parameters({"UserName","Password"})
	public void Logout(String UsernameVal , String Password) {
		
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
		password.sendKeys(Password);
		login.click();
		logout.click();
		
	}
	
	
	
	
}
