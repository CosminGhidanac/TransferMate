package TransferMate;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Hooks;
import pageObjects.SignUpPage;

public class AcceptTermsRegistrationTest extends Hooks {

	public AcceptTermsRegistrationTest() throws IOException {
		super();

	}

	@Test

	public void acceptTermsRegistration() throws IOException {

		SignUpPage signUp = new SignUpPage();
		signUp.getCorporateRadioBtn().click();
		Select option = new Select(signUp.getCountryDropD());
		option.selectByVisibleText("Romania");
		signUp.getFirstName().sendKeys("John");
		signUp.getLastName().sendKeys("doe");
		signUp.getEmail().sendKeys("john.doenew@test.com");
		Select option2 = new Select(signUp.getPrefixPhoneDropD());
		option2.selectByVisibleText("Romania +40");
		signUp.getPhoneNr().sendKeys("768 965 554"); // fake number
		signUp.getSubscribeBtn().click();
		//Assert Message Alert Error
		String actualText = signUp.getIncorectPrivacyTxt().getText();
		String expectedText = "Click OK to return and check the box that you have read and agree with our Terms of Use";
		Assert.assertEquals(actualText, expectedText);

	}
}
