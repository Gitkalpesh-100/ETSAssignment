package com.application.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.application.elements.LoginPageElements;

public class LoginPageSteps extends LoginPageElements{
	
	public LoginPageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void launchApplication() {
		launchApplication(prop.getProperty("url"));
	}
	
	public void verifyApplicationIsLaunchedSuccessfully(String expected) {
		Assert.assertEquals(getTitle(), expected);
		wait(2);
	}
	
	public void verifyLogo() {
		Assert.assertTrue(isDisplayed(logo));
	}
	
	public void verifyCaption(String expected) {
		Assert.assertEquals(getText(caption), expected);
	}
	
	public void verifyLoginHeader(String expected) {
		Assert.assertEquals(getText(loginPageHeader), expected);
	}
	
	public void enterCredentials(String username,String password) {
		enterInfo(usernameTxtb, username);
		enterInfo(passwordTxtb, password);
	}
	
	public void clickOnLogInButton() {
		click(loginBtn);
	}
	
	public void clickOnRegistrationLink() {
		click(registrationLink);
	}	

}
