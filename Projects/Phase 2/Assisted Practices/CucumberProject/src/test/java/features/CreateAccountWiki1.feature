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
# you will create a data table
# rows and columns = table
# the data in the rows & columns = data table
# It is always created in feature file

Feature: Create account on wiki page

Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details
| admin | admin@123 | admin@123 | admin@gmail.com |
| maya | admin@123 | admin@123 | maya@gmail.com |
| riya | admin@123 | admin@123 | riya@gmail.com |
| John | admin@123 | admin@123 | John@gmail.com |
| Marc | admin@123 | admin@123 | Marc@gmail.com |
Then Account creation is successfull


Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details using column name
| Username | Password | retype | Email ID|
| admin | admin@123 | admin@123 | admin@gmail.com |
| maya | admin@123 | admin@123 | maya@gmail.com |
| riya | admin@123 | admin@123 | riya@gmail.com |
| John | admin@123 | admin@123 | John@gmail.com |
| Marc | admin@123 | admin@123 | Marc@gmail.com |
Then Account creation is successfull