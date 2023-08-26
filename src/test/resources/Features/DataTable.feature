Feature: Test the login functionality of OrangeHRM using Data Table

  #Method-4
  Scenario: Test the valid login using DataTable
    Given user is on loginPage
    When user enters credentails using DataTable
      | Admin | admin123 |
    And click on Login button
    Then user should land on home page
