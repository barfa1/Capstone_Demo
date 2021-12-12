package tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Parameters;
import pages.LoginPage;

public class LogoutTest extends BaseClass {
	@Test
	@Parameters({"UserName","Password"})
	public void Logout(String correctUser, String correctPass) {
		test = report.startTest("Logout Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,correctPass);
		test.log(LogStatus.PASS, "Logout successful", "Logout test run Successfully ");
		report.endTest(test);
	}
	
}
