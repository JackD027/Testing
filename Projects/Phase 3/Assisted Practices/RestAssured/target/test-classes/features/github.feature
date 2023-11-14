Feature: Test GitHub api using RestAssured

  Scenario: Get all repo using Bearer Authorization
    Given User Enters GitHub base URL and Authorization
    When User executes HTTP get method
    Then Validate the response status code
