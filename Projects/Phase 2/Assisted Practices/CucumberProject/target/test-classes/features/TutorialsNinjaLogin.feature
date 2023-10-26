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
# In BDD, the test data will be put in the feature file
# username: seleniumdemo@gmail.com
# passowrd: 123456
# If you ahve a small test data to be passed to the feature step, then use:
# Examples keyword
# '<EmailId>' is a placeHolder, it is like an object or variable which will store the test data for the step
Feature: Enter login Credentials on tutorialsNinja Page

  Scenario Outline: Test username and password for Login Page
    Given I am on tutorialsNinja Homepage
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click login button

    Examples: 
      | EmailId                | password |
      | seleniumdemo@gmail.com |   123456 |

