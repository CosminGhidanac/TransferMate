package TransferMate;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Hooks;
import pageObjects.SignUpPage;

public class InvalidMailTest extends Hooks {

	public InvalidMailTest() throws IOException {
		super();

	}

	@Test
	public void invalidMailRegistration() throws IOException {

		SignUpPage signUp = new SignUpPage();
		signUp.getCorporateRadioBtn().click();
		Select option = new Select(signUp.getCountryDropD());
		option.selectByVisibleText("Romania");
		signUp.getFirstName().sendKeys("John");
		signUp.getLastName().sendKeys("doe");
		signUp.getEmail().sendKeys("john.doe");
		Select option2 = new Select(signUp.getPrefixPhoneDropD());
		option2.selectByVisibleText("Romania +40");
		signUp.getPhoneNr().sendKeys("768 965 554"); // fake number
		signUp.getTermsPivacyCheck().click();
		signUp.getSubscribeBtn().click();
		//Assert Message Alert Error
		String actualText = signUp.getIncorectEmailTxt().getText();
		String expectedText = "Please enter correct information!";
		Assert.assertEquals(actualText, expectedText);
	}

}
