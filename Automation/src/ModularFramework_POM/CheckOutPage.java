package ModularFramework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage 
{
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement billingNewAddress;
	@FindBy(id = "Billing-address-select") private WebElement billingAddressDD;
	@FindBy(id = "BillingNewAddress_City") private WebElement billingNewAddressCity;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement billingNewAddressAddress1;
	@FindBy(id = "BillingNewAddress_Address2") private WebElement billingNewAddressAddress2;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement billingNewAddressZipPostalCode;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement billingNewAddressPhoneNumber;
	@FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
	
	@FindBy(id = "shipping-address-select") private WebElement shippingAddressDD;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderContinueButton;
	
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getBillingNewAddress() {
		return billingNewAddress;
	}

	public WebElement getBillingAddressDD() {
		return billingAddressDD;
	}

	public WebElement getBillingNewAddressCity() {
		return billingNewAddressCity;
	}

	public WebElement getBillingNewAddressAddress1() {
		return billingNewAddressAddress1;
	}

	public WebElement getBillingNewAddressAddress2() {
		return billingNewAddressAddress2;
	}

	public WebElement getBillingNewAddressZipPostalCode() {
		return billingNewAddressZipPostalCode;
	}

	public WebElement getBillingNewAddressPhoneNumber() {
		return billingNewAddressPhoneNumber;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressDD() {
		return shippingAddressDD;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}
	
	//Optional Method/ Buisness Logic
	public void buyProduct(String city, String address1, String pinCode, String phoneNo) throws InterruptedException
	{
		 SelectUtility su = new SelectUtility();
		 try {
			if (billingAddressDD.isDisplayed()) 
			{
				su.selectByVisibleTextMethod(billingNewAddress, "New Address");
			}
		} 
		 catch (Exception e) {
			// TODO: handle exception
			 su.selectByVisibleTextMethod(billingAddressDD, "India");
		}
		 su.selectByVisibleTextMethod(billingAddressDD, "India");
		 
		 billingNewAddressCity.sendKeys(city);
		 billingNewAddressAddress1.sendKeys(address1);
		 billingNewAddressZipPostalCode.sendKeys(pinCode);
		 billingNewAddressPhoneNumber.sendKeys(phoneNo);
		 Thread.sleep(2000);
		 billingAddressContinueButton.click();
		 shippingAddressContinueButton.click();
	     shippingMethodContinueButton.click();
	   	 paymentMethodContinueButton.click();
		 paymentInfoContinueButton.click();
		 confirmOrderContinueButton.click();
	}
	
}


