package Org.PomRepositpry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	//Declaration
	
@FindBy(id= "Email") private WebElement emailTextbox;
@FindBy(id= "Password") private WebElement passwordTextBox;
@FindBy(id= "RememberMe") private WebElement rememberemeChechBox;
@FindBy(linkText ="Forgot password?") private WebElement forgotPasswordLink;
@FindBy(xpath="//input[@value='Log in']") private WebElement loginButton;


//Initialization
public LoginPage(WebDriver driver) // webdriver pass in constructor because pagefactory need driver reference to search the element  
{
	PageFactory.initElements(driver , this); // this keyword hold the address of current class object
}


//Utilization
 
public WebElement getEmailTextbox() {
	return emailTextbox;
}


public WebElement getPasswordTextBox() {
	return passwordTextBox;
}


public WebElement getRememberemeChechBox() {
	return rememberemeChechBox;
}


public WebElement getForgotPasswordLink() {
	return forgotPasswordLink;
}


public WebElement getLoginButton() {
	return loginButton;
}



}
