@MercuryTest
Feature: Mercury website validations

  Background: Launch the Mercury website
    Given I launch the Mercury url

  @LoginTest
  Scenario: Validate login functionality
    When I enter "userName" as "admin"
    And I enter "Password" as "admin"
    And I click on "Login" button
    Then I should see "Login Successfully" text

  @LoginTest2
  Scenario Outline: Validate login functionality test
    When I enter "userName" as "<unm>"
    And I enter "Password" as "<pswd>"
    And I click on "Login" button
    Then I should see "Login Successfully" text
    @DataTest1
    Examples:
      | unm   | pswd  |
      | admin | admin |
      | test  | test  |
      | demo  | demo  |
    @DataTest2
    Examples:
      | unm  | pswd |
      | manu | manu |


