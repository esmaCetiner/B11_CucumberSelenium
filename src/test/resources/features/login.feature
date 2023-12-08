@regression @login

  # @wip --> work in progress
  # Ctrl + alt + L --> formats the page structure
  # To find all related syntax or words or tags --> ctrl + shift + F

Feature: DevEx log in test
  # Agile Story: As a user, I should be able to log in, so that I can see my dashboard.
  @teacher @smoke
  Scenario: Log in as a teacher
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  @student @smoke @test
  Scenario: Log in as a student
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

  @developer  #Log in as a developer
  Scenario: Log in as a developer
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login


   # -Write scenarios in navigationMenu.feature
  #-Create step definitions
  #-No need to use any JAVA code.
  #-Just implement the step definitions by adding print statement.
  #-Create new class NavigationMenuStepDefs

  # Scenario: Developer page test
  #Login as Developer
  #At first get the text of welcome
  #Then go to Developers menu and get the text of Developers
  #
  #Scenario: Posts page test
  #Login as Student
  #Get the text of welcome
  #Then go to All Posts menu and get the text of Posts
  #
  #Scenario: Dashboard page test
  #Login as Teacher
  #Get the text of welcome
  #Then go to My Account menu and get the text of Dashboard