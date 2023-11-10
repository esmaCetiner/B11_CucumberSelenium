
Feature: Navigate to Menu with Parameters
  @wip
  Scenario: Teacher navigates to All Posts Menu
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    When The user navigate to "All Posts" Menu
    Then The user should be able to see header "Posts"

  Scenario: Developer navigates to My Account Menu
    Given The user is on the login page
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The welcome message contains "Jack Bauer "
    When The user navigate to "All Posts" Menu
    And The user navigate to "My Account" Menu
    Then The user should be able to see header "Dashboard"