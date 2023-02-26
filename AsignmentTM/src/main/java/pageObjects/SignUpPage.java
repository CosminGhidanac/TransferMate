package pageObjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;


public class SignUpPage extends BasePage {
	
	public WebDriver driver;
	
	public SignUpPage() throws IOException {
		super();		
	}
	
	By educationRadioBtn = By.cssSelector("#register_account_type_education_form_input [for]");
	By individualRadioBtn = By.cssSelector("#register_account_type_individual_form_input [for]");
	By corporateRadioBtn = By.cssSelector("#register_account_type_corporate_form_input [for]");
	By partnershipRadioBtn = By.cssSelector("#register_account_type_partnership_form_input [for]");
	By soleTraderRadioBtn = By.cssSelector("#register_account_type_sole_trader_form_input [for]");
	By countryDropD = By.cssSelector("select#country");
	By firstName = By.cssSelector("input#first_name");
	By lastName = By.cssSelector("input#last_name");
	By email = By.cssSelector("input#email");
	By prefixPhoneDropD = By.cssSelector("select#__pin_mobile_number_international_dialing_code");
	By phoneNr = By.cssSelector("input#__pin_mobile_number_mobile_phone");
	By termsPivacyCheck = By.cssSelector("#register_terms_of_use_agree_form_input [for]");
	By newsCheck = By.cssSelector("#register_newsletter_and_privacy_policy_agree_form_input [for]");
	By subscribeBtn = By.cssSelector("input#button_subscribe");
	By captchaText = By.xpath("//div[@id='cal_captcha_f10_question']");
	By captchaResult = By.cssSelector("#__calc_captcha_text");
	By checkEmailTxt = By.cssSelector("[class='font-weight-normal mb-3']");
	By incorectEmailTxt = By.cssSelector("#register_email_error");
	By incorectPrivacyTxt = By.cssSelector("#register_terms_of_use_agree_error");
	
	
	public WebElement getEducationRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(educationRadioBtn);
	}
	
	public WebElement getIndividualRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(individualRadioBtn);
	}
	
	public WebElement getCorporateRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(corporateRadioBtn);
	}
	
	public WebElement getPartnershipRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(partnershipRadioBtn);
	}
	
	public WebElement getSoleTraderRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(soleTraderRadioBtn);
	}
	
	public WebElement getCountryDropD() throws IOException {
		this.driver = getDriver();
		return driver.findElement(countryDropD);
	}
	
	public WebElement getFirstName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lastName);
	}
	
	public WebElement getEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(email);
	}
	
	public WebElement getPrefixPhoneDropD() throws IOException {
		this.driver = getDriver();
		return driver.findElement(prefixPhoneDropD);
	}
	
	public WebElement getPhoneNr() throws IOException {
		this.driver = getDriver();
		return driver.findElement(phoneNr);
	}
	
	public WebElement getTermsPivacyCheck() throws IOException {
		this.driver = getDriver();
		return driver.findElement(termsPivacyCheck);
	}
	
	public WebElement getNewsCheck() throws IOException {
		this.driver = getDriver();
		return driver.findElement(newsCheck);
	}
	
	
	public WebElement getSubscribeBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(subscribeBtn);
	}
	
	
	public WebElement getCaptchaText() throws IOException {
		this.driver = getDriver();
		return driver.findElement(captchaText);
	}
	
	public WebElement getCaptchaResult() throws IOException {
		this.driver = getDriver();
		return driver.findElement(captchaResult);
	}
		
	public WebElement getCheckEmailTxt() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkEmailTxt);
	}
	
	public WebElement getIncorectEmailTxt() throws IOException {
		this.driver = getDriver();
		return driver.findElement(incorectEmailTxt);
	}
	
	public WebElement getIncorectPrivacyTxt() throws IOException {
		this.driver = getDriver();
		return driver.findElement(incorectPrivacyTxt);
	}
}
