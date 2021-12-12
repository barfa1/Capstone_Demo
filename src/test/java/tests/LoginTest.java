package tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Parameters;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	@Parameters({"UserName","Password"})
	public void PositiveLogin(String correctUser, String correctPass) {
		test = report.startTest("Positive Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,correctPass);
		if(driver.getCurrentUrl().equals("http://localhost:8080/Section7LEP2/dashboard"))
		test.log(LogStatus.PASS, "Login successful", "Login test run Successfully ");
		report.endTest(test);
	}
	
	@Test
	@Parameters({"UserName","WrongPassword"})
	public void NegativeLogin(String correctUser, String wrongPassword) {
		test = report.startTest("Negative Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,wrongPassword);
		if(driver.getCurrentUrl() != "http://localhost:8080/Section7LEP2/dashboard")
		test.log(LogStatus.PASS, "Login unsuccessful", "Negative Login test run Successfully ");
		report.endTest(test);
	}
	
}
