package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.SignUpPage;

public class SignupTest extends BaseClass{
	
	@Test
	@Parameters({"UserName","Password","Fname","Lname","Age","Address"})
	public void DoSignUp(
			String UsernameVal ,
			String Password ,
			String Fname , 
			String Lname ,
			String Age ,
			String Address
			) {
		test = report.startTest("Signup  Test");
		SignUpPage signup = new SignUpPage();
		signup.SignUp(UsernameVal ,Password ,Fname , Lname ,Age ,Address);
		report.endTest(test);
	}
}
