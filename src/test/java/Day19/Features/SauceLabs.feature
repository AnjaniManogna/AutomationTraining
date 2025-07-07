Feature: Sauce Labs Page

  Background: Login
    Given Launch Swag Labs url

    @SauceDemo
  Scenario Outline: Login functionality
    Given Enter "UserName" as "<unm>"
    And  Enter "password" as "<pswd>"
    When click "login" button
    Then Should see correct home Page url
    Examples:
      | unm           | pswd         |
      | standard_user | secret_sauce |
