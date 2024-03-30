package com.techReward.steps;

import com.techReward.elements.UserManagementModuleElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserManagementModuleSteps extends UserManagementModuleElements {
	public UserManagementModuleSteps() {
		PageFactory.initElements(driver, this);
	}

	public void goToMenuBarAndClickOnMenu(String elementName) {
		moveToElement(getElement(menuTexts, elementName));
		click(getElement(menuTexts, elementName));
	}

	public void clickOnSideToggle() {
		moveToElement(asideToggle);
		click(asideToggle);
	}

	public void clickOnManageUsers() {
		moveToElement(userManagementIcon);
	}

	public void enterDetails(WebElement element, String value) {
		waitForVisibilityOfElement(element, 10);
		enterInfo(element, value);
	}

	public void selectUserGroup(String value) {
		waitForElement(By.className("menu-text"), 10);
		waitForTextTobeVisible(value).click();
	}

	public void submitCreateUpdatePopup() {
		click(submitButton);
	}

	public void waitForTheClosingOfPopUp() {
		waitForInVisibilityOfElement(createUpdateEditPopUp, 10);
	}

	public String statusMessage() {
		waitForVisibilityOfElement(statusMessage, 10);
		return getText(statusMessage);
	}

	public void clickOnDeleteButton() {
		waitForVisibilityOfElement(deleteButton, 10);
		wait(2);
		actionClick(deleteButton);
		waitForInVisibilityOfElement(createUpdateEditPopUp, 10);
	}

	public void closeTheViewUserPopUp() {
		waitForVisibilityOfElement(closeButton, 10);
		click(closeButton);
		waitForInVisibilityOfElement(createUpdateEditPopUp, 10);
	}

	public void searchUser(String userInfo) {
		waitForVisibilityOfElement(searchBox, 10);
		enterInfo(searchBox, userInfo);
	}

	public void closeTheUserGroupList() {
		click(arrowDropDownOfUserGroupField);
	}

	public void enterFirstName(String value) {
		enterDetails(firstName, value);
	}

	public void enterLastName(String value) {
		enterDetails(lastName, value);
	}

	public void enterJobTitle(String value) {
		enterDetails(jobTitle, value);
	}

	public void enterContactNo(String value) {
		enterDetails(contactNo, value);
	}

	public void enterEmail(String value) {
		enterDetails(email, value);
	}

	public void enterPassword(String value) {
		enterDetails(password, value);
	}

	public void enterRewardPoint(String value) {
		enterDetails(rewardPoint, value);
	}

	public void clickUserGroup() {
		click(SelectUserGroup);
	}

	public void clickOnAddButtonToCreateUser() {
		waitForVisibilityOfElement(addButton, 10);
		scrollToTop();
		moveToElement(addButton);
		actionClick(addButton);
		waitForVisibilityOfElement(createUpdateEditPopUp, 10);
	}

	public void clickOnCreditDebitRadio(String creditDebitRadioValue) {
		waitForVisibilityOfAllElement(creditDebitRadio, 10);
		click(getElement(creditDebitRadio, creditDebitRadioValue));
	}

	public String getUserTableValue(int row, int column) {
		return getTableValue(userTable, row, column);
	}

	public void viewUserRow(int row) {
		wait(3);
		waitForVisibilityOfElement(viewRow(row), 10);
		click(viewRow(row));
		waitForVisibilityOfElement(createUpdateEditPopUp, 10);
	}

	public void updateUserRow(int row) {
		wait(2);
		click_using_keys(updateRow(row));
	}

	public void deleteUserRow(int row) {
		wait(2);
		actionClick(deleteRow(row));
		waitForVisibilityOfElement(createUpdateEditPopUp, 10);
	}

	public String verifyViewUserTableRowAndColumnIs(int row, int column) {
		String value = getTableValue(viewUserTable, row, column);
		return value;
	}

}
