Feature: DB Tests


  @db
  Scenario Outline: edit profile with scenario outline
    Given The user is on the login page
    When The user logs in using "<email>" and "<password>"
    And The user navigates to "<subMenu>" menu
    And The user select status "<status>"
    And The user slides the slider <num>
    And The user add "company" "<company>"
    And The user add "website" "<website>"
    And The user add "location" "<location>"
    And The user add "skills" "<skills>"
    And The user add "githubusername" "<githubusername>"
    And The user add "bio" "<bio>"
    And The user clicks on the submit button
    Then The user verifies that profile info has been successfully updated
    Then Verify that user "<email>" profiles "company" db value is equal to "<company>"
    Then Verify that user "<email>" profiles "website" db value is equal to "<website>"
    Then Verify that user "<email>" profiles "location" db value is equal to "<location>"
    Then Verify that user "<email>" UI "skills" value match with DB value
    Then Verify that user "<email>" UI "status" value match with DB value
    Then Verify that user "<email>" UI "githubusername" value match with DB value
    Examples:
      | email              | password | subMenu      | status                | num | company  | website                        | location | skills                 | githubusername      | bio                             |
      | sdetecet@gmail.com | sdetecet | Edit Profile | Instructor or Teacher | 3   | Eurotech | https://www.eurotechstudy.com/ | Deutschland   | Java,Selenium,Cucumber | sdetb11test | I want to be an SDET  |
