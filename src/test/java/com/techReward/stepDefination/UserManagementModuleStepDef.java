package com.techReward.stepDefination;

import com.techReward.steps.UserManagementModuleSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import static com.framework.utilities.CommonUtils.randomMailId;
import static com.framework.utilities.CommonUtils.tenDigitRandomNum;

public class UserManagementModuleStepDef extends UserManagementModuleSteps {

    @Given("Go to menu bar and click on {string}")
    public void goToMenuBarAndClickOn_UserManagement(String elementName) {
//        waitForTextTobeVisible(elementName);
        goToMenuBarAndClickOnMenu(elementName);
    }

    @And("Click on manage users")
    public void clickOn_ManageUsers() {
        actionClick(ManageUsers);
    }

    @And("Click on side toggle of menu bar")
    public void clickOnToggle() {
        clickOnSideToggle();
    }

    @Given("Click on add button to create user")
    public void click_on_add_button_to_create_user() {
        clickOnAddButtonToCreateUser();
    }

    @Given("Enter First name {string}")
    public void enter_first_name(String value) {
        enterFirstName(value);
    }

    @Given("Enter Last name {string}")
    public void enter_last_name(String value) {
        enterLastName(value);
    }

    @Given("Enter Job title {string}")
    public void enter_job_title(String value) {
        enterJobTitle(value);
    }

    @Given("^Enter Contact no to be (.*)$")
    public void enter_contact_no(String value) {
        if (value.contains("unique") || value.contains("random")) {
            enterContactNo(tenDigitRandomNum());
        } else {
            enterContactNo(value);
        }
    }

    @Given("^Enter email id to be (.*)$")
    public void enter_email(String value) {
        if (value.contains("unique") || value.contains("random")||value.equalsIgnoreCase("")) {
            enterEmail(randomMailId());
        } else {
            enterEmail(value);
        }
    }

    @Given("Enter Password {string}")
    public void enter_password(String value) {
        enterPassword(value);
    }

    @Given("Enter Reward point {string}")
    public void enter_reward_point(String value) {
        enterRewardPoint(value);
    }

    @Given("Click on user group")
    public void click_user_group() {
        clickUserGroup();
    }

    @Given("Select user group {string}")
    public void select_user_group(String value) {
        selectUserGroup(value);
    }

    @And("Close the user group list")
    public void close_TheUser_GroupList() {
        closeTheUserGroupList();
    }

    @And("Click on Submit button and create user")
    public void clickOnSubmitButtonAndCreateUser() {
        submitCreateUpdatePopup();
    }

    @And("Click on Submit button and update user")
    public void clickOnSubmitButtonAndUpdateUser() {
        submitCreateUpdatePopup();
    }

    @And("Search for the user by entering relevant information {string}")
    public void searchForTheUserByEnteringRelevantInformation(String userInfo) {
        searchUser(userInfo);
    }

    @And("Update or edit the user of row {int}")
    public void updateUserOfRow(int rowNum) {
        updateUserRow(rowNum);
    }

    @And("Select radio type of {string}")
    public void selectRadioTypeOf(String pointName) {
        clickOnCreditDebitRadio(pointName);
    }

    @And("Delete the user of row {int}")
    public void deleteTheUserOfRow(int rowNum) {
        deleteUserRow(rowNum);
    }

    @And("View the user of row {int}")
    public void viewTheUserOfRow(int rowNum) {
        viewUserRow(rowNum);
    }


    @Then("Verify value of user data table in row {int} and column {int} is {string}")
    public void verifyValueInRowAndColumnIs(int rowNum, int columnNum, String fieldValue) {
        String actualValue = getUserTableValue(rowNum, columnNum);
        softAssert.assertEquals(actualValue, fieldValue);
    }

    @When("Click on delete button")
    public void click_On_Delete_Button() {
        clickOnDeleteButton();
    }

    @When("Close the View user Pop up")
    public void close_The_View_User_PopUp() {
        closeTheViewUserPopUp();
    }

    @Then("Verify the status message {string}")
    public void verifyTheStatusMessage(String message) {
        Assert.assertEquals(message, statusMessage());
    }

    @Then("Verify view user table row {int} and column {int} is {string}")
    public void verify_View_User_Table_Row_And_ColumnIs(int row, int column, String expectedValue) {
        String actualValue = verifyViewUserTableRowAndColumnIs(row, column);
        softAssert.assertEquals(actualValue, expectedValue);
    }
     @And("^Close Driver$") 
     public void close_driver() {
    	 driver.close();
     }
    @And("Verify all the assertions in the table")
    public void verifyAllTheAssertions() {
        softAssert.assertAll();
    }

    @And("wait for user table and page to load")
    public void waitForValueInTableAtRowAndColumnIs() {
        wait(2);
    }

    @And("Wait for the closing of pop up")
    public void wait_For_The_ClosingOfPopUp() {
        waitForTheClosingOfPopUp();
    }
}
