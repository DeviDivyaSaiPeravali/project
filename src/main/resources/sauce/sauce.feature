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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @TS_01
  Scenario Outline: Login to Swag labs with valid credentials
    Given the user launched the chrome browser
    When the user opens Swaglabs homepage
    When the user enters valid "<username>" and "<password>"
    When click the login button
    Then Assert if the product_label is displayed

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |

  @TS_02
  Scenario: Login to Swag labs with invalid credentials
    Given user launched the chrome browser
    When user opens swaglabs homepage
    When user enters invalid  username and password
    When the user clicks the login button
    Then Assert if the error message is displayed

  @TS_03
  Scenario: Sorting in the order of A-Z
    Given Launching the chrome browser
    When launching the application
    When click on Name A to Z
    When compare the first two item names
    Then assert if the two names are in alpahbetical order

  @TS_04
  Scenario: Logout of Application
    Given lAUNCHing the browser
    When lAUNCHing the application
    When click on Menu bar
    When click on Logout button
    Then assert if the application is showing the login page

  @TS_05
  Scenario: Navigating to Saucelabs
    Given lAUNCHIng the browser
    When lAUNCHIng the application
    When cLick on menu bar
    When click on About
    Then assert if the page is navigating to saucelabs
