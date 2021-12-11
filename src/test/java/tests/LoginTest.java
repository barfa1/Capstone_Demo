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

import pages.AddToCartPage;
import pages.CheckoutAndOrderViewPage;
//import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.SignUpPage;

public class LoginTest extends BaseClass {
	
//	@Test
//	@Parameters({"UserName","Password","Fname","Lname","Age","Address"})
//	public void DoSignUp(
//			String UsernameVal ,
//			String Password ,
//			String Fname , 
//			String Lname ,
//			String Age ,
//			String Address
//			) {
//		test = report.startTest("Signup  Test");
//		SignUpPage signup = new SignUpPage();
//		signup.SignUp(UsernameVal ,Password ,Fname , Lname ,Age ,Address);
//		report.endTest(test);
//	}
//	
	
	@Test
	@Parameters({"UserName","Password"})
	public void PositiveLogin(String correctUser, String correctPass) {
		test = report.startTest("Positive Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,correctPass);
		report.endTest(test);
	}
	
//	@Test
//	public void DoAddToCart() {
//		test = report.startTest("Add to cart Test");
//		AddToCartPage adct = new AddToCartPage();
//		String product = adct.AddToCart();
//		Assert.assertEquals(product, "HP Laptop ABC");
//		report.endTest(test);
//	}
//	
//	@Test
//	public void DoCheckoutAndOrder() {
//		test = report.startTest("Checkout order Test");
//		CheckoutAndOrderViewPage checkout_and_order = new CheckoutAndOrderViewPage();
//		checkout_and_order.CheckoutAndOrder();
//		report.endTest(test);
//	}
	
	
	
	
}
