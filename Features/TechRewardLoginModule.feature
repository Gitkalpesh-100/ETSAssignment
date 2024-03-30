Feature: TechReward Login module operations and validations

  Background:Launch the application and browser
    Given Launch the application TechReward
    Then Application should be open page with title "Login - Admin Panel"

  @Functional @Positive
  Scenario: Verify Application login with valid credentials
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    And Close Driver

  @Functional @Negative
  Scenario: Verify Application login with invalid credentials
    Given Enter user name testAdmin@yopmail.com and password Admin@123
    And Click on Submit button
    Then Verify the error alert is "Invalid credentials"
    And Close Driver

  @Functional @Negative
  Scenario: Verify Application login with invalid credentials, password is less than 6 digit
    Given Enter user name testing@yopmail.com and password Admin
    And Click on Submit button
    Then Verify the error message is "Password length should be at least 6"
    And Close Driver

  @Functional @Negative
  Scenario: Verify Application login with invalid credentials, removing .com from email id
    Given Enter user name testAdmin@yopmail and password Admin@123
    And Click on Submit button
    Then Verify the error message is "Valid Authorised email ID required"
    And Close Driver

  @Functional @Negative
  Scenario: Verify Application login with invalid credentials, removing @ from email id
    Given Enter user name testingyopmail.com and password Admin@123
    And Click on Submit button
    Then Verify the error message is "Valid Authorised email ID required"
    And Close Driver
