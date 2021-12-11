package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentTest;

import tests.BaseClass;

public class AddToCartPage {
	
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
	
	@FindBy(linkText="Home")
	WebElement home;
	
	@FindBy(xpath="//tr/td[contains(text(),'HP Laptop ABC')]")
	WebElement prodoct;

	
	@FindBy(xpath="//tr/td[contains(text(),'HP Laptop ABC')]/following-sibling::td/a")
	WebElement product_addto_cart;
	
//	==================== init Elements in Class constructor ==========
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

//	================ class Methods =====================
	
	
	public String AddToCart(String UsernameVal , String Password) {
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
//		test.log(LogStatus.PASS, "Entered username "+UsernameVal, "Successfully Enetered username");

		password.sendKeys(Password);
//		test.log(LogStatus.PASS, "Entered password "+Password, "Successfully Enetered Password");
		
		
		

		login.click();
		home.click();
		product_addto_cart.click();
		return prodoct.getText();
	}
}
