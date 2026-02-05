package ModularFramework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	// declaration
	@FindBy (id= "gender-male") private WebElement maleRadioButton;
	@FindBy (id= "gender-female") private WebElement femaleRadioButton;
	@FindBy (id= "FirstName") private WebElement firsttextbox;
	@FindBy (id="LastName") private WebElement lastnameTxtBox;
	@FindBy (id= "Email") private WebElement emailTextBox;
	@FindBy (id= "Password") private WebElement passwordTextBox;
	@FindBy (id= "ConfirmPassword") private WebElement confirmPasswordTextBox;
	@FindBy (id= "register-button") private WebElement registerButton;
	
	//initialization
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirsttextbox() {
		return firsttextbox;
	}

	public WebElement getLastnameTxtBox() {
		return lastnameTxtBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	
}
