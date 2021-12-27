Feature: Admin Log In
  As a admin user, I want to login with valid credential
  so, I can use all facility

  @login
  Scenario: As a admin user, when I login successfully
    so, I can add new employee and employee can login successfully with valid credential.

    Given I am on login page
    When I enter valid credential
    And click on login button
    And I should be able to login successfully
    And I click on PIM menu name
    And I click on sub menu add employee
    And I enter valid details
    And I click on save button
    And I click on welcome button and click on logout
    And employee enter valid credential
    Then employee should able to login successfully

