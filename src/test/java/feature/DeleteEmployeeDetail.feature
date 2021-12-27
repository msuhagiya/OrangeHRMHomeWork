Feature: Delete Employee detail
  As a admin user, I want to login with valid credential
  so, I can use all facility

@delete
  Scenario: As a admin user, when I login successfully
  so, I can delete employee detail successfully

    Given I am on login page
    When I enter valid credential
    And click on login button
    And I should be able to login successfully
    And I click on PIM menu name
    And I click on sub menu employee list
    And I enter valid employee name
    And I click on search button
    And select valid employee name checkbox
    And I click on delete button
    And I click on ok alert button
    Then I should be able to delete employee record successfully