package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseSetUp.BaseSetUp;
import PageObjects.LoginPage;

public class LoginTest extends BaseSetUp{
	
	private LoginPage Lp;
	
	@BeforeMethod()
	private void init() {
		Lp = new LoginPage(driver);
	}
	
	@Test
	public void TestLogin() {
		Lp.UserLogin("pcasgs155@gmail.com", "Rekha.Sp");
	}

}
