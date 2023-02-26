package TransferMate;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Hooks;
import pageObjects.SignUpPage;

public class SuccesfulRegistrationTest extends Hooks {

	public SuccesfulRegistrationTest() throws IOException {
		super();

	}

	@Test // This test may fail occasionally because there is a math captcha that needs
			// to be solved to proceed, and sometimes I am unable to solve it correctly.
			// Although it was challenging to get past the captcha, I enjoyed trying to find
			// a solution. I am aware that there may be simpler ways to bypass the captcha,
			// so I would appreciate any suggestions for a better solution.
	public void succesfulRegistration() throws IOException, InterruptedException {

		SignUpPage signUp = new SignUpPage();
		signUp.getCorporateRadioBtn().click();
		Select option = new Select(signUp.getCountryDropD());
		option.selectByVisibleText("Romania");
		signUp.getFirstName().sendKeys("John");
		signUp.getLastName().sendKeys("doe");
		signUp.getEmail().sendKeys("JohnTesterA2B2@test.com"); // note: every test needs new mail
		Select option2 = new Select(signUp.getPrefixPhoneDropD());
		option2.selectByVisibleText("Romania +40");
		signUp.getPhoneNr().sendKeys("768 965 554"); // fake number
		signUp.getTermsPivacyCheck().click();
		methodCaptcha();
		signUp.getSubscribeBtn().click();
		//Assert Message Alert Error
		String actualText = signUp.getCheckEmailTxt().getText();
		String expectedText = "Check your mail";
		Assert.assertEquals(actualText, expectedText);
	}
}
