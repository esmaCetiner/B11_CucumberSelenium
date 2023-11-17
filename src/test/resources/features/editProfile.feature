@wip
Feature: The user should be able to edit profile information

  Background:
    Given The user is on the login page


  Scenario: edit profile
    When The user logs in using "sdetb11@eurotech.study" and "Test1234"
    And The user navigates to "Edit Profile" menu
    And The user select status "Developer"
    And The user slides the slider 5
    And The user add "company" "Amazon"
    And The user add "website" "https://aws.amazon.com/"
    And The user add "location" "Washington"
    And The user add "skills" "Java, JS, React, Selenium"
    And The user add "githubusername" "sdetb11test"
    And The user add "bio" "I want to be QA automation tester"
    And The user clicks on the submit button
    Then The user verifies that profile info has been successfully updated

  Scenario Outline: edit profile with scenario outline
    When The user logs in using "<email>" and "<password>"
    And The user navigates to "<subMenu>" menu
    And The user select status "<status>"
    And The user slides the slider <num>
    And The user add "company" "<company>"
    And The user add "website" "<website>"
    And The user add "location" "<location>"
    And The user add "skills" "<skills>"
    And The user add "githubusername" "<github>"
    And The user add "bio" "<bio>"
    And The user clicks on the submit button
    Then The user verifies that profile info has been successfully updated
    Examples:
      | email                  | password | subMenu      | status                | num | company  | website                        | location | skills                 | github      | bio                             |
      | sdetb11@eurotech.study | Test1234 | Edit Profile | Instructor or Teacher | 3   | Eurotech | https://www.eurotechstudy.com/ | Berlin   | Java,Selenium,Cucumber | sdetb11test | I want to be an SDET instructor |

  @edit_with_DT
  Scenario Outline: edit profile with scenario outline
    When The user logs in using "<email>" and "<password>"
    And The user navigates to "<subMenu>" menu
    And The user select status "<status>"
    And The user slides the slider <num>
    And The user add following information into related inputBox
      | firstColumn    | secondColumn     |
      | company        | <company>        |
      | website        | <website>        |
      | location       | <location>       |
      | skills         | <skills>         |
      | githubusername | <githubusername> |
      | bio            | <bio>            |
    And The user clicks on the submit button
    Examples:
      | email                  | password | subMenu      | status                | num | company  | website                        | location | skills                 | github      | bio                             |
      | sdetb11@eurotech.study | Test1234 | Edit Profile | Instructor or Teacher | 3   | Eurotech | https://www.eurotechstudy.com/ | Berlin   | Java,Selenium,Cucumber | sdetb11test | I want to be an SDET instructor |
