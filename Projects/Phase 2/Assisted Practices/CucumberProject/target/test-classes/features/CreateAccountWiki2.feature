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

@all
Feature: Test the Wiki page on chrome Browser

@create @functional
Scenario: Test Create account on Wiki Page
Given User is on Main page 
Then User Enters username
And User enters Password

@login @functional
Scenario: Test Login link on Wiki Page
Given User is on Main page 
When User clicks on Login link
Then User clicks on checkbox on login Page
Then User clicks on Forgot your password? link

