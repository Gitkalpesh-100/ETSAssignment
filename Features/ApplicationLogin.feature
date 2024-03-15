#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Parabank Login Feature
  I want to use this feature file to validate Parabank application Login Feature

  Background: Initialize all pages and Launch the application
    Given Initialize all page object classes
    And Launch the application using "https://parabank.parasoft.com/parabank/index.htm"
    Then Application should be launched successfully with title "ParaBank | Welcome | Online Banking"

  @Functional
  Scenario: Verify Application Logo
    And Verify application Logo

  @Functional
  Scenario: Verify Application Caption
    And Verify application Caption displayed as "Experience the difference"

  @Functional
  Scenario: Verify Application Login Page Header
    And Verify application login page header displayed as "Customer Login"

  @Regression
  Scenario Outline: Title of your scenario outline
    When User enter <username> and <password>
    And Click on Login button
    Then Login should be successful

    Examples: 
      | username     | password |
      | admin        | admin    |
      | invalid_user |          |
