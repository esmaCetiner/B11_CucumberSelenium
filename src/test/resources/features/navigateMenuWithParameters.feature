Feature: Navigate to Menu with Parameters

  Background:
    Given The user is on the login page

  Scenario: Teacher navigates to All Posts Menu
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    When The user navigate to "All Posts" Menu
    Then The user should be able to see header "Posts"

  Scenario: Developer navigates to My Account Menu
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The welcome message contains "Jack Bauer "
    When The user navigate to "All Posts" Menu
    And The user navigate to "My Account" Menu
    Then The user should be able to see header "Dashboard"


    # login as a teacher
  # verify welcome message
  # go to developer page
  # verify "Filter Profiles by Skill or by Location"

  Scenario: Teacher navigates to Developers Menu
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    When The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"


  Scenario Outline: Different user navigates different menu
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    When The user navigate to "<menu>" Menu
    Then The user should be able to see header "<header>"
    Examples:
      | userType               | password   | name       | menu       | header                                  |
      | eurotech@gmail.com     | Test12345! | Teacher    | All Posts  | Posts                                   |
      | sdetb11@eurotech.study | Test1234   | sdetb11    | My Account | Dashboard                               |
      | jackbauer@gmail.com    | Admin123   | Jack Bauer | Developers | Filter Profiles by Skill or by Location |