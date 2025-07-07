Feature: Login Feature

  Background: Launch the Mercury website
    Given I launch the Mercury url

  @LoginTest
  Scenario: Execute User actions
    Given The following UI actions are performed:
      | action | element  | value |
      | Enter  | userName | admin |
      | Enter  | Password | admin |
      | Click  | Login    |       |
    Then I should see "Login Successfully" text
