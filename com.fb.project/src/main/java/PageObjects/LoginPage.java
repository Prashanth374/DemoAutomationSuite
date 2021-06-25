package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement UN;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement PWD;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement Btn_Login;
	
	private WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void UserLogin(String Un, String pwd) {
		UN.sendKeys(Un);
		PWD.sendKeys(pwd);
		Btn_Login.click();
	}

}
