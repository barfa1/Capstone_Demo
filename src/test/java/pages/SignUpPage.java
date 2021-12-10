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

public class SignUpPage {
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;

	@FindBy(linkText="Login/Signup")
	WebElement navigate_to_login;
	
	@FindBy(linkText="Not a member? Signup")
	WebElement navigate_to_signup;
	
	@FindBy(name="email_id")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(name="pwd2")
	WebElement cnfm_password;
	
	@FindBy(name="fname")
	WebElement fname;
	
	@FindBy(name="lname")
	WebElement lname;
	
	@FindBy(name="age")
	WebElement age;
	
	@FindBy(name="address")
	WebElement address;
	
	
	@FindBy(tagName = "button")
	WebElement signup;
	
//	==================== init Elements in Class constructor ==========
	public SignUpPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
//	================ class Methods =====================
	@Parameters({"UserName","Password","Fname","Lname","Age","Address"})
	public void SignUp(
			String UsernameVal ,
			String Password ,
			String Fname , 
			String Lname ,
			String Age ,
			String Address
			) {
//		WebElement loginlink = driver.findElement(By.xpath("//a[contains(text(),'Login/Signup')]"));
		navigate_to_login.click();
//		WebElement navigate_to_signup = driver.findElement(By.xpath("//a[contains(text(),'Not a member? Signup')]"));
		navigate_to_signup.click();
		
//		WebElement username = driver.findElement(By.name("email_id"));
//		WebElement password = driver.findElement(By.name("pwd"));
//		WebElement cnfm_password = driver.findElement(By.name("pwd2"));
//		WebElement fname = driver.findElement(By.name("fname"));
//		WebElement lname = driver.findElement(By.name("lname"));
//		WebElement age = driver.findElement(By.name("age"));
//		WebElement address = driver.findElement(By.name("address"));
		
	
//		WebElement signup = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		
		
//		navigate_to_signup.click();
		username.sendKeys(UsernameVal);
		System.out.println(UsernameVal);
		password.sendKeys(Password);
		cnfm_password.sendKeys(Password);
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);
		age.sendKeys(Age);
		address.sendKeys(Address);
		signup.click();
		
	}
	
	
	
}
