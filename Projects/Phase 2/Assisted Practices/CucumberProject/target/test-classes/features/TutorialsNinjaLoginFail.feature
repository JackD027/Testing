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
#""" (Doc Strings)
## this is used when we have to write 2-3 lines of text in the feature file,
## instead of writitng it in a single line, you can write it in multiple lines using Doc Strings

Feature: Email page Test

Scenario: New File for docString demo
When I reset my passowrd on the email
Then I should recieve an email with following content
"""
Hello Admin,
 Pls click on this to reset the password
Thanks
Admin Team
"""
