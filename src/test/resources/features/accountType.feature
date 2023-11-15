
Feature: Account Type

  Background:
    Given The user is on the login page

  Scenario: Teacher navigates to All Posts Menu
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"

  Scenario: Teacher navigates to All Posts Menu
    When The user logs in using "sdetb11@eurotech.study" and "Test1234"
    Then The welcome message contains "sdetb11"

  Scenario: Developer navigates to My Account Menu
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The welcome message contains "Jack Bauer"

  Scenario Outline: Different userType
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    Examples:
      | userType               | password    | name       |
      | eurotech@gmail.com     | Test12345!  | Teacher    |
      | sdetb11@eurotech.study | Test1234    | sdetb11    |
      | jackbauer@gmail.com    | Admin123    | Jack Bauer |
      | odesali@gmail.com      | odesalim05  | odesa      |
      | batch11test@gmail.com  | Yilmaz.1234 | b11Test    |
