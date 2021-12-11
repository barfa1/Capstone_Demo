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
//import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class AddToCartTest extends BaseClass {
	
	@Parameters({"UserName","Password"})
	@Test
	public void DoAddToCart(String UserNameVal,String Password) {
		test = report.startTest("Add to cart Test");
		AddToCartPage adct = new AddToCartPage();
		String product = adct.AddToCart(UserNameVal , Password);
		Assert.assertEquals(product, "HP Laptop ABC");
		report.endTest(test);
	}
	
	
}
