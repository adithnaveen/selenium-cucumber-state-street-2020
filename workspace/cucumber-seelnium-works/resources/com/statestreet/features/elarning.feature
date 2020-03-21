## this is my comment
#author : Naveen Kumar K S
@login
Feature: to login to the user

  Background: 
    Given the application is loaded

  Scenario: validate for valid credentials
    Given the user name and password is entered
    When the user credentials are valid
    Then take user to home page
    And check the name of the user
