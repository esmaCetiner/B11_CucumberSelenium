Feature: Data Driven Testing in Cucumber
  @ddf_test
  Scenario Outline: DDF Login Test
    Given The user is on the login page
    When The user enters "<sheetName>" and row number <rowNumber>
    Then The user verifies that welcome message contains in excel "<sheetName>" <rowNumber>
    And The user verifies that "<infoTitle>" info in excel "<sheetName>" <rowNumber>
    Examples:
      | sheetName | rowNumber | infoTitle |
      | Test Data | 0         | Company   |
      | Test Data | 1         | Title     |
      | Test Data | 2         | Company   |
      | Test Data | 3         | Title     |
      | Test Data | 4         | Company   |
      | Test Data | 5         | Title     |
      | Test Data | 6         | Company   |
      | Test Data | 7         | Title     |