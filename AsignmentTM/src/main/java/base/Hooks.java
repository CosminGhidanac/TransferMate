package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.SignUpPage;

public class Hooks  extends BasePage{

	public Hooks() throws IOException {
		super();
	}

	@BeforeTest
	public void setup() throws IOException {
		getDriver().get(getUrl());
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000); // only for purpose to observe the browser
		WebDriverInstance.cleanupDriver();
	}
	
	//Still working on it
	public void methodCaptcha() throws IOException {
		
		SignUpPage signUp = new SignUpPage();
		String str = signUp.getCaptchaText().getText().trim();
		System.out.println("This is string: " + str);
		waitForElementVisible(signUp.getCaptchaText(),5);
		String operator = signUp.getCaptchaText().getText().replaceAll("[^+\\-*/]", "");
		System.out.println("This is operator: " + operator);
		
		
		String s3 = str.substring(2, 3).replaceAll("[^+\\-*/]", "").trim(); // operator 1/1 digit case
//		System.out.println("This is s3 (? + ? = ?): " + s3);
		String s6 = str.substring(3, 4).replaceAll("[^+\\-*/]", "").trim();// operator 2/1 digit case	
//		System.out.println("This is s6 (?? + ? = ?): " + s6);
		String s9 = str.substring(2, 3).replaceAll("[^+\\-*/]", "").trim(); // operator 1/2 digit case
//		System.out.println("This is s9 (? + ?? = ?: " + s9);
		String s12 = str.substring(3, 4).replaceAll("[^+\\-*/]", "").trim();// operator 2/2 digit case
//		System.out.println("This is s12(?? + ??): " + s12);

		Integer i = null;
		
		if (s3.equals("+")) {
			String s1 = str.substring(0, 1).replaceAll("[^\\d]", "").trim(); // 1 digit case
			String s2 = str.substring(4, 5).replaceAll("[^\\d]", "").trim(); // 1 digit case
			Integer i1 = Integer.valueOf(s1);
			Integer i2 = Integer.valueOf(s2);
//			System.out.println("this is i1:" + i1);
//			System.out.println("this is i2:" + i2);
			System.out.println("this is first if:(? + ? = ?) " + (i = i1 + i2));
		}if (s3.equals("-")){
			String s1 = str.substring(0, 1).replaceAll("[^\\d]", "").trim(); // 1 digit case
			String s2 = str.substring(4, 5).replaceAll("[^\\d]", "").trim(); // 1 digit case
			Integer i1 = Integer.valueOf(s1);
			Integer i2 = Integer.valueOf(s2);
//			System.out.println("this is i1:" + i1);
//			System.out.println("this is i2:" + i2);
			System.out.println("this is second if:(? - ? = ?) " + (i = i1 - i2));
		}if (s6.equals("+")) {
			String s4 = str.substring(0, 3).replaceAll("[^\\d]", "").trim(); // 2 digit case
			String s5 = str.substring(5, 7).replaceAll("[^\\d]", "").trim();// 1 digit case
			Integer i4 = Integer.valueOf(s4);
			Integer i5 = Integer.valueOf(s5);
//			System.out.println("this is i4:" + i4);
//			System.out.println("this is i5:" + i5);
			System.out.println("this is third if:(?? + ? = ?) " + (i = i4 + i5));
		}if (s6.equals("-")){
			String s4 = str.substring(0, 3).replaceAll("[^\\d]", "").trim(); // 2 digit case
			String s5 = str.substring(5, 7).replaceAll("[^\\d]", "").trim();// 1 digit case
			Integer i4 = Integer.valueOf(s4);
			Integer i5 = Integer.valueOf(s5);
//			System.out.println("this is i4:" + i4);
//			System.out.println("this is i5:" + i5);
			System.out.println("this is fourth if:(?? - ? = ?) " + (i = i4 - i5));
		}else if (s9.equals("+")) {
			String s7 = str.substring(0, 1).replaceAll("[^\\d]", "").trim(); // 1 digit case
			String s8 = str.substring(4, 7).replaceAll("[^\\d]", "").trim(); // 2 digit case
			Integer i7 = Integer.valueOf(s7);
			Integer i8 = Integer.valueOf(s8);
//			System.out.println("this is i7:" + i7);
//			System.out.println("this is i8:" + i8);
			System.out.println("this is fifth if:(? + ?? = ?) " + (i = i7 + i8));
		}else if (s9.equals("-")){
			String s7 = str.substring(0, 1).replaceAll("[^\\d]", "").trim(); // 1 digit case
			String s8 = str.substring(4, 7).replaceAll("[^\\d]", "").trim(); // 2 digit case
			Integer i7 = Integer.valueOf(s7);
			Integer i8 = Integer.valueOf(s8);
//			System.out.println("this is i7:" + i7);
//			System.out.println("this is i8:" + i8);
			System.out.println("this is sixth if:(? - ?? = ?) " + (i = i7 - i8));
		}if (s12.equals("+")) {
			String s10 = str.substring(0, 3).trim();// 2 digit case
			String s11 = str.substring(5, 7).trim();// 2 digit case
			Integer i10 = Integer.valueOf(s10);
			Integer i11 = Integer.valueOf(s11);
//			System.out.println("this is i10:" + i10);
//			System.out.println("this is i11:" + i11);
			System.out.println("this is seven if:(?? + ?? = ?) " + (i = i10 + i11));
		}if(s12.equals("-")){
			String s10 = str.substring(0, 3).trim();// 2 digit case
			String s11 = str.substring(5, 7).trim();// 2 digit case
			Integer i10 = Integer.valueOf(s10);
			Integer i11 = Integer.valueOf(s11);
//			System.out.println("this is i10:" + i10);
//			System.out.println("this is i11:" + i11);
			System.out.println("this is eigth if:(?? + ?? = ?) " + (i = i10 - i11));
		}
		
		waitForElementVisible(signUp.getCaptchaText(),5);
		String ans = String.valueOf(i);
		signUp.getCaptchaResult().sendKeys(ans);
		
		

	}
	
}
