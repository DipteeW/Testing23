
Feature: Login to orangehrmlive

Scenario: Login to orangehrmlive with valid credentials
Given User is on LoginPage
When User Enter Username
And User Enter passwordField
And User click on Loginbutton
Then User should be on Dashboard

