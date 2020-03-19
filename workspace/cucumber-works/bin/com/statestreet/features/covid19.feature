@sanity @covid19-4thday
Feature: for checking the patient is affected

  Scenario: to check patient on 4th day
    Given the patient is fell ill
    When has repeated "caughing"
    Then do a body checkout
    And keep patient in isolation

  Scenario: to check patient on 4th day
    Given the patient is fell ill
    When has repeated "sneeze"
    Then do a body checkout
    And keep patient in isolation
    
