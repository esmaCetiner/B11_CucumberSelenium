Feature: Dashboard Page Menu

  Scenario: User should be able to see Base Menu after log in
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user should be able to see following menu
    | Developers |
    | All Posts |
    | My Account |

    Scenario: Log in as a specific user
      Given The user is on the login page
      When The user in using following credentials
      | userEmail | eurotech@gmail.com |
      | password | Test12345! |
      | message | Teacher |
    And The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |

  Scenario: User should be able to see Dashboard Menu after log in
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user should be able to see following editAdd menu
      | Edit Profile   |
      | Add Experience |
      | Add Education  |

    