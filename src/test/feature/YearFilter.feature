
@YearTest

Feature: As a user I want to check year filter


  Scenario: Verify User enters correct year to check filter search result
	Given I am on emerald insight search result page
	Then  I should navigate to emerald insight page
	When  I enter from "1999" to "2010" and click Go Button
	Then  I should see Search Result & Number of Articles

  Scenario Outline: Verify User enters incorrect year number to check filter search result
	Given I am on emerald insight search result page
	Then  I should navigate to emerald insight page
	When  I enter from "<From Year>" to "<To Year>" and click Go Button
	Then  I should see an "<Error Message>"


	Examples:
	  |From Year | To Year | Error Message |
	  | 2022     |         | No Search results |
	  | 2022     | 2000    | No Search results |
