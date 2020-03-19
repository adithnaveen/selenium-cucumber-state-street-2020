@sanity @workfromhome
Feature: to work from home

  Scenario: work from home when office not working
    Given the public transport is not available
    And the office is not opened
    When work from home option is "allowed"
    Then the work is done
    But need to fill time sheet

	@wfh-notallowed
  Scenario: work from home when office not working and not allowed 
    Given the public transport is not available
    And the office is not opened
    When work from home option is "notallowed"
    Then the work is done
    But need to fill time sheet
    And need managers approval 
    