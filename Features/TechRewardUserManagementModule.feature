Feature: TechReward User Management module operations and validations

  Background:Launch the application and browser
    Given Launch the application TechReward
    Then Application should be open page with title "Login - Admin Panel"

  @Functional @Positive
  Scenario: Add user in Manage Users of User Management menu
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    And Click on add button to create user
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be unique
    And Enter email id to be unique
    And Enter Password "Kas3pesh@1857"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "SBI"
    And Close the user group list
    When Click on Submit button and create user
    And Wait for the closing of pop up
    Then Verify the status message "Inserted Successfully"
    And Close Driver

  @Functional @Negative
  Scenario: Add user in Manage Users of User Management menu and enter duplicate Contact no
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    And Click on add button to create user
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be 9776462048
    And Enter email id to be unique
    And Enter Password "Kas3pesh@1857"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "SBI"
    And Close the user group list
    When Click on Submit button and create user
    Then Verify the error message is "Contact no has already been taken"
    And Close Driver

  @Functional @Negative
  Scenario: Add user in Manage Users of User Management menu and enter Contact no less than 10 digits
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    And Click on add button to create user
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be 97764620
    And Enter email id to be unique
    And Enter Password "Kas3pesh@1857"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "SBI"
    And Close the user group list
    When Click on Submit button and create user
    Then Verify the error message is "Contact no must be 10 digits"
    And Close Driver


  @Functional @Negative
  Scenario: Add user in Manage Users of User Management menu and enter duplicate email id
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    And Click on add button to create user
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be unique
    And Enter email id to be kalpesh9909@gmail.com
    And Enter Password "Kas3pesh@1857"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "SBI"
    And Close the user group list
    When Click on Submit button and create user
    Then Verify the error message is "Email has already been taken."
    And Close Driver

  @Functional @Negative
  Scenario: Add user in Manage Users of User Management menu and enter email id missing @ symbol
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    And Click on add button to create user
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be unique
    And Enter email id to be kalpesh9909gmail.com
    And Enter Password "Kas3pesh@1857"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "SBI"
    And Close the user group list
    When Click on Submit button and create user
    Then Verify the error message is "Invalid email"
    And Close Driver

  @Functional @Negative
  Scenario: Add user in Manage Users of User Management menu and enter email id missing .com
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    And Click on add button to create user
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be unique
    And Enter email id to be kalpesh9909gmail
    And Enter Password "Kas3pesh@1857"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "SBI"
    And Close the user group list
    When Click on Submit button and create user
    Then Verify the error message is "Invalid email"
    And Close Driver

  @Functional @Positive
  Scenario: Update or edit the user
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
#    And Search for the user by entering relevant information "9824131169"
    And Update or edit the user of row 1
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be unique
    And Enter email id to be unique
    And Select radio type of "Credit Point"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "New group1"
    And Close the user group list
    And Click on Submit button and update user
    And Wait for the closing of pop up
    Then Verify the status message "Edited Successfully"
    And Close Driver

  @Functional @Negative
  Scenario: Update or edit the user with duplicate mail id
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
#    And Search for the user by entering relevant information "9824131169"
    And Update or edit the user of row 1
    And Enter First name "Sample"
    And Enter Last name "User"
    And Enter Job title "Test Automation"
    And Enter Contact no to be unique
    And Enter email id to be kalpesh9909@gmail.com
    And Select radio type of "Credit Point"
    And Enter Reward point "9"
    And Click on user group
    And Select user group "New group1"
    And Close the user group list
    And Click on Submit button and update user
    And Wait for the closing of pop up
    Then Verify the error message is "Email has already been taken."
    And Close Driver

  @Functional @Positive
  Scenario: Delete the user
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    #And Search for the user by entering relevant information "7300092049"
    And Delete the user of row 1
    When Click on delete button
    Then Verify the status message "Deleted Successfully"
    And Close Driver

  @Functional @Positive
  Scenario: Search the user
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    And Go to menu bar and click on "User Management"
    When Click on manage users
    And Search for the user by entering relevant information "9776462048"
    And View the user of row 1
    Then Verify view user table row 1 and column 2 is "Sample User"
    And Verify view user table row 2 and column 2 is "Test Automation"
    And Verify view user table row 3 and column 2 is "9776462048"
    And Verify view user table row 4 and column 2 is "kalpesh9@gmil.com"
    And Verify view user table row 6 and column 2 is "9"
    And Verify view user table row 5 and column 2 is "SBI"
    And Verify all the assertions in the table
    And Close the View user Pop up
    Then Close Driver


  @Functional @Positive
  Scenario: Search the user by entering value into search box
    Given Enter user name testing@yopmail.com and password Admin@123
    And Click on Submit button
    Then Application should be open page with title "Dashboard - Admin Panel"
    Given Click on side toggle of menu bar
    Given Go to menu bar and click on "User Management"
    And Click on manage users
    And Search for the user by entering relevant information "namrata.t@gmail.com"
    And wait for user table and page to load
    Then Verify value of user data table in row 1 and column 2 is "133"
    And Verify value of user data table in row 1 and column 3 is "Namrata Tahilramani"
    And Verify value of user data table in row 1 and column 4 is "PgUser"
    And Verify value of user data table in row 1 and column 5 is "9645123789"
    And Verify value of user data table in row 1 and column 6 is "namrata.t@gmail.com"
    And Verify value of user data table in row 1 and column 7 is "SBI"
    And Verify value of user data table in row 1 and column 8 is "1,500"
    And Verify all the assertions in the table
    Then Close Driver

