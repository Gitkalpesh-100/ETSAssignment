package com.application.tests;

import org.openqa.selenium.WebDriver;

import com.application.steps.HomePageSteps;
import com.application.steps.LoginPageSteps;
import com.application.steps.RegistrationPageSteps;
import com.framework.base.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationStepDefinition {
	
	public LoginPageSteps loginpage = null;
	public HomePageSteps homepage = null;
	public RegistrationPageSteps regpage = null;
	
	@Given("Initialize all page object classes")
	public void initialize_all_page_object_classes() {
		WebDriver driver = new BasePage().getDriver();
		loginpage = new LoginPageSteps(driver);
		homepage = new HomePageSteps(driver);
		regpage = new RegistrationPageSteps(driver);	
	    
	}

	@Given("Launch the application using {string}")
	public void launch_the_application_using(String string) {
		loginpage.launchApplication(string);
	    
	}

	@Then("Application should be launched successfully with title {string}")
	public void application_should_be_launched_successfully_with_title(String string) {
		loginpage.verifyApplicationIsLaunchedSuccessfully(string);
	    
	}

	@Then("Verify application Logo")
	public void verify_application_logo() {
		loginpage.verifyLogo();	    
	}

	@Then("Verify application Caption displayed as {string}")
	public void verify_application_caption_displayed_as(String string) {
		loginpage.verifyCaption(string);
	    
	}

	@Then("Verify application login page header displayed as {string}")
	public void verify_application_login_page_header_displayed_as(String string) {
		loginpage.verifyLoginHeader(string);
	    
	}

	@When("^User enter (.*) and (.*)$")
	public void enterCredentials(String username, String password) {
		loginpage.enterCredentials(username, password);
	    
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		loginpage.clickOnLogInButton();
	    
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
	    homepage.verifyLoginIsSuccessful();	    
	}

}
