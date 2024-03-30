package com.techReward.elements;

import com.framework.commons.WebCommons;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserManagementModuleElements extends WebCommons {
    @FindBy(id = "kt_aside_toggle")
    protected WebElement asideToggle;
    @FindBy(css = "[class='menu-icon flaticon-users']")
    protected WebElement userManagementIcon;
    @FindBy(className = "menu-text")
    protected List<WebElement> menuTexts;
    @FindBy(xpath = "//span[text()='Manage Users']")
    protected WebElement ManageUsers;
    @FindBy(xpath = "(//span[@class='v-btn__content']//*[local-name()='svg' and @role='img'])[1]")
    protected WebElement addButton;
    @FindBy(name = "first_name")
    protected WebElement firstName;
    @FindBy(name = "last_name")
    protected WebElement lastName;
    @FindBy(name = "job_title")
    protected WebElement jobTitle;
    @FindBy(name = "contact_no")
    protected WebElement contactNo;
    @FindBy(name = "email")
    protected WebElement email;
    @FindBy(name = "password")
    protected WebElement password;
    @FindBy(name = "reward_point")
    protected WebElement rewardPoint;
    @FindBy(name = "userGroupList")
    protected WebElement SelectUserGroup;
    @FindBy(xpath = "//div[@class='v-list-item__title']")
    protected List<WebElement> userGroups;
    @FindBy(xpath = "//div[@class='v-input__slot' and @role='combobox']/descendant::i")
    protected WebElement arrowDropDownOfUserGroupField;
    @FindBy(css = "button[type='submit']")
    protected WebElement submitButton;
    @FindBy(xpath = "//form[@role='form']/descendant::button[@type='button']/span[contains(text(),'Delete')]")
    protected WebElement deleteButton;
    @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Cancel')]")
    protected WebElement cancelButton;
    @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Close')]")
    protected WebElement closeButton;
    @FindBy(xpath = "//div[@class='v-text-field__slot']/input[@type='text']")
    protected WebElement searchBox;
    @FindBy(xpath = "//div[@class='v-card v-sheet theme--light']")
    protected WebElement createUpdateEditPopUp;
    @FindBy(xpath = "//div[@role='radiogroup']/descendant::label")
    protected List<WebElement> creditDebitRadio;
    @FindBy(css = "div[role='status']")
    protected WebElement statusMessage;
    protected String viewUserTable="//div[@class='v-card__text']/table";
    protected String userTable="//div[@class='v-data-table__wrapper']/table";
}
