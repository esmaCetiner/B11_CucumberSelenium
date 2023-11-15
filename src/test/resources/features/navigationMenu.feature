@navigationMenu @regression
Feature: Navigation Menu Task

  Scenario: Navigation to Developers Menu
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to see welcome message
    When The user navigate to Developer Menu
    Then The user able to see developer text
    @db
    Scenario: Navigation to All Post Menu
      Given The user is on the login page
      When The user enters student credentials
      Then The user should be able to see welcome message
      When The user navigate to All Posts Menu
      Then The user able to see Posts text

  Scenario: Navigation to My Account Menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to see welcome message
    When The user navigate toMy Account Menu
    Then The user able to see Dashboard text
