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
@tag
Feature: Kayak Application
 
  @tag1
  Scenario Outline: check Reservation
    Given launch browser and open site "https://www.kayak.com/"
    When user clicks on flights
    
    Then enter <origin> and <destination>
    And enter <deptDate> and <returnDate>
    Then click on search
    
    Examples:
    |origin|destination|deptDate|returnDate|
    |San Jose|India|/8/31|9/25|

  
