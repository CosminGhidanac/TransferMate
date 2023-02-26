package TransferMate;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.SignUpPage;

public class InvalidPhoneRegistration extends Hooks {

	public InvalidPhoneRegistration() throws IOException {
		super();

	}

	@Test // "If the captcha math check is successful, this test exposes a defect since it
			// allows the user to proceed past the submit button even if the country and
			// phone number do not correspond. However, this is my personal observation.
			// Overall, I enjoyed testing this registration page. Thank you."
	public void invalidPhoneRegistration() throws IOException {

		SignUpPage signUp = new SignUpPage();
		signUp.getCorporateRadioBtn().click();
		Select option = new Select(signUp.getCountryDropD());
		option.selectByVisibleText("Italy");
		signUp.getFirstName().sendKeys("John");
		signUp.getLastName().sendKeys("doe");
		signUp.getEmail().sendKeys("JohnTesterA1B1@test.com"); // note: every test needs new mail
		Select option2 = new Select(signUp.getPrefixPhoneDropD());
		option2.selectByVisibleText("Romania +40");
		signUp.getPhoneNr().sendKeys("768 965 554"); // fake number
		signUp.getTermsPivacyCheck().click();
		methodCaptcha();
		signUp.getSubscribeBtn().click();
		// Assert: The test pass if the register button is still present
		Assert.assertTrue(signUp.getSubscribeBtn().isDisplayed());

	}
}
