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

Feature: Phase End project

Scenario: Star health home page test

Given User open the chrome browser and starhealth application
When User  waits for the Welcome to Star Health pop-up and closes it
Then  validates the Star Health home page title using a JUnit assertion 
Then  clicks on the Buy Now button 
And User enters following details
| name | contact | pin |
| Shubham | 9876543210 | 211002 | 
And Validate the user mobile number
And User clicks on the Star Health logo 
And Close all the browsers
