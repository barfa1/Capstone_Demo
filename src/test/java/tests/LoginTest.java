package tests;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	@Parameters({"UserName","Password"})
	public void PositiveLogin(String correctUser, String correctPass) {
//		test = report.startTest("Positive Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,correctPass);
//		report.endTest(test);
	}
	
	
}
