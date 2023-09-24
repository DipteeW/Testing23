Feature: Login to facebook

Scenario: Login to Facebook with valid credentials
Given User is on Login Page
When User Enter EmailID
And User Enter password
And User click on Login button
Then User should be on HomePage