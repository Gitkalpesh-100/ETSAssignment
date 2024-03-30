package com.techReward.steps;

import com.techReward.elements.LoginModuleElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginModuleSteps extends LoginModuleElements {
    public LoginModuleSteps() {
        PageFactory.initElements(driver, this);
    }

    public void launchApplication() {
        launchApplication(prop.getProperty("url"));
    }

    public void verifyApplicationIsLaunchedSuccessfully(String expected) {
        waitForTitle(expected);
        Assert.assertEquals(getTitle(), expected);
        wait(2);
    }

    public void enterCredentials(String username, String password) {
        enterInfo(userEmail, username);
        enterInfo(userPassword, password);
    }

    public void clickOnSubmitButton() {
        moveToElement(submit);
        click(submit);
    }
    public String errorAlert(){
        waitForVisibilityOfElement(errorAlert,5);
        return getText(errorAlert);
    }
    public String errorMesssage(){
        //waitForVisibilityOfElement(errorMesssage,5);
        return getText(errorMesssage);
    }

}
