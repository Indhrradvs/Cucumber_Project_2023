Feature: Test the login functionality of OrangeHRM

Scenario: Test the valid Login

Given user is on loginPage
When user enters username and password
And click on Login button
Then user should land on home page