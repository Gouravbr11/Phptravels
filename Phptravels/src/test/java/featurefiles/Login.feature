@tag
Feature: Login to application

	Background:
		When clicked on login button

  @tag1
  Scenario Outline: login scenario
    Given Enter <email> and <password> in login page
    When verify not a robot by clicking checkbox
    And click on login button
    Then home page should be displayed
    
    Examples:
    | email | password |
    | godd@gmail.com | Password123 |
   

