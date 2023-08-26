@FunctionalTest
Feature: Using of Tags in Cucumber

		@SmokeTest
    Scenario: scenario1
    Given This is a scenario1
   
    @SmokeTest
    Scenario: scenario2
    Given This is a scenario2
   
   @SanityTest @SmokeTest
   Scenario: scenario3
    Given This is a scenario3
   
   Scenario: scenario4
    Given This is a scenario4
   
   Scenario: scenario5
    Given This is a scenario5
    
   Scenario: scenario6
    Given This is a scenario6
   