@navigationMenu @regression
Feature: Navigation Menu Task
  @db
  Scenario: Navigation to Developers Menu
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to see welcome message
    When The user navigates to Developer Menu
    Then The user able to see developer text

  Scenario: Navigation to All Posts Menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to see welcome message
    When The user navigates to All Posts Menu
    Then The user able to see Posts text

  Scenario: Navigation to My Account Menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to see welcome message
    When The user navigates to My Account Menu
    Then The user able to see Dashboard text