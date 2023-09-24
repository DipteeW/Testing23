Feature: Bank Login

Scenario: Valid login
Given the user is on the bank login page
When the user enters valid credentials
And clicks the login button
Then the user should be logged into their account
