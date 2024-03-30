package com.techReward.elements;

import com.framework.commons.WebCommons;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginModuleElements extends WebCommons {
    @FindBy(name = "email")
    protected WebElement userEmail;
    @FindBy(name = "password")
    protected WebElement userPassword;
    @FindBy(className = "v-btn__content")
    protected WebElement submit;
    @FindBy(css = "div[role='alert']")
    public WebElement errorAlert;
    @FindBy(xpath = "//div[@class='v-messages__wrapper']/div")
    public WebElement errorMesssage;
}
