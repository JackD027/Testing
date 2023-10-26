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

# this mean if this tag is called, all the scenario will run
# after the tag, we dont write anything

@all  
Feature: Testing on NinjaDemo application

Background:
Given I am on tutorialsNinja Homepage

@login @smoke
 Scenario Outline: Test username and password for Login Page
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click login button
  	And I close browser
    Examples: 
      | EmailId                | password |
      | seleniumdemo@gmail.com |   123456 |

@search @regression
Scenario:
Then I enter Input for the search box
And I click on search button
And I close browser

@AddtoCart @regression
Scenario:

And I click on Add to Cart button
And I close browser

@checkout @regression
Scenario:

And I click on Checkout button
And I close browser

@logout @smoke
Scenario:

Then I click on my account link
And I click on logout link
And I close browser
