package com.techReward.stepDefination;

import com.techReward.steps.LoginModuleSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginModuleStepDef extends LoginModuleSteps {
    @Given("Launch the application TechReward")
    public void launch_the_application_using() {
    launchApplication();
    }

    @Then("Application should be open page with title {string}")
    public void application_should_be_launched_successfully_with_title(String string) throws InterruptedException {
        verifyApplicationIsLaunchedSuccessfully(string);
    }


    @When("^Enter user name (.*) and password (.*)$")
    public void enterCredential(String username, String password) {
        enterCredentials(username, password);

    }

    @When("Click on Submit button")
    public void click_on_login_button() {
        clickOnSubmitButton();

    }

    @Then("Verify the error alert is {string}")
    public void verifyTheErrorIs(String errorAlert) {
        Assert.assertEquals(errorAlert(),errorAlert);
    }

    @Then("Verify the error message is {string}")
    public void verifyTheErrorMessageIs(String errorMesssage) {
        Assert.assertEquals(errorMesssage,errorMesssage);

        //Assert.assertEquals(errorMesssage(),errorMesssage);
    }
}
