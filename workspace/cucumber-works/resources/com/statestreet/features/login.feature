@login
Feature: login feature

  Scenario: 
    Given the application is running
    When the username and password is entered
      | username | password     |
      | mahesh   | hello12$34   |
      | arun     | secret3344&  |
      | arpita   | 8765testing$ |
      | pooja    | testin5g$ |
      | vivek    | hello123$ |
    Then take user to home screen

    
