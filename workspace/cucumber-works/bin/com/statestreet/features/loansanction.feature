@sanity @loansanction

Feature: loan sanction

# if you have the Background and this code will executed before 
# each scenario in the .feature file 
Background: 
	Given load the application 

  Scenario Outline: sanctioning loan for startup
    Given the company is registered in "<year>" act
    And in india
      | state     | city       |
      | karnataka | bengaluru  |
      | karnataka | davanagere |
    When the company is formed with atleast "<noofyears>" years
    Then "<processingstatus>" to issuing authority

    Examples: 
      | year | noofyears | processingstatus |
      | 2011 |         3 | process          |
      | 2011 |         4 | process          |
      | 2011 |         5 | process          |
      | 2011 |         1 | nottoprocess     |
      | 1956 |         3 | process          |
