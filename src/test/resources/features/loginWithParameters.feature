
Feature: Log in as different user
  # Agile Story: As a user, I should be able to log in as different user

  Scenario: Log in as Teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"


  Scenario: Log in as Student with parameters
    Given The user is on the login page
    When The user logs in using "sdetb11@eurotech.study" and "Test1234"
    Then The user should be able to login
    And The welcome message contains "sdetb11"

    # HOMEWORK
  #Create a new feature file named navigateMenuWithParameters.feature

  # login as a teacher
  # verify welcome message
  # go to Post page
  # verify "Post"

  # login as a teacher
  # verify welcome message
  # go to developer page
  # verify "Filter Profiles by Skill or by Location"

  # login as a student
  # verify welcome message
  # go to Post page
  # verify "Post"

  # login as a developer
  # verify welcome message
  # go to Dashboard page
  # verify "Dashboard"