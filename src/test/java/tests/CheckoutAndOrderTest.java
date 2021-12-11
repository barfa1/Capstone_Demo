package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CheckoutAndOrderViewPage;
import pages.LoginPage;

public class CheckoutAndOrderTest extends BaseClass {
	
	@Parameters({"UserName","Password"})
	@Test
	public void DoCheckoutAndOrder(String UsernameVal, String Password) {
		test = report.startTest("Checkout Order Test");
		CheckoutAndOrderViewPage checkout_and_order = new CheckoutAndOrderViewPage();
		checkout_and_order.CheckoutAndOrder(UsernameVal,Password);
		report.endTest(test);
	}
}
