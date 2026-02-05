package Org.PomRepositpry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage 
{
	//Declaration

	@FindBy(id="gender-male") private WebElement genderRadioButton;
	@FindBy(id= "FirstName") private WebElement fristName;
	@FindBy(id="LirstName") private WebElement lastName;
	@FindBy(id="Email") private WebElement email;
	@FindBy(id= "Password") private WebElement password;
	@FindBy(id= "ConfirmPassword") private WebElement confirmPassword;
	@FindBy(id="register-button") private WebElement registerButton;
	
}
