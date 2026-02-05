package ModularFramework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id = "Email") 
	private WebElement loginEmailTB;
	
	
	@FindBy(id = "Password") 
	private WebElement loginPasswordTB;
	
	@FindBy(name = "RememberMe") 
	private WebElement loginRememberMeCB;
	
	@FindBy(xpath = "//a[text()='Forgot password?']") 
	private WebElement loginForgetPasswordTB;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginEmailTB() {
		return loginEmailTB;
	}

	public WebElement getLoginPasswordTB() {
		return loginPasswordTB;
	}

	public WebElement getLoginRememberMeCB() {
		return loginRememberMeCB;
	}

	public WebElement getLoginForgetPasswordTB() {
		return loginForgetPasswordTB;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
}