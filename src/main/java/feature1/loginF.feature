@smoke @sanity @regression
Feature: Login to facebook

  #Background: Preconditions for all scenarios in this feature file only
   # Given User is on Login Web Page

  @smoke
  Scenario: Login to Facebook with valid credentials
    Given User is on Login Web Page
    When User Enter Email
    And User Enter password Field
    And User click on Login
    Then User should be on Home Page
    And User closes browser

  @sanity @mobileShopping @Payment
  Scenario: Login to Facebook with given credentials
    Given User is on Login Web Page
    When User Enter "atipune.soft@gmail.com" as EmailID
    And User Enter "abcd@123" password Field
    And User click on Login
    Then User should be on Home Page
    And User closes browser

  @sanity @regression
  Scenario: Login to Facebook with valid credentials
    Given User is on Login Web Page
    When User Enter credetials for email and password
      | atipune.soft@gmail.com  | abcd@123 |
      | atipune123@gmail.com    | efgh@123 |
      | atipune.soft2@gmail.com | ijkl@123 |
      | atipune.soft3@gmail.com | mnop@123 |
    And User click on Login
    Then User should be on Home Page
    And User closes browser

  @smoke
  Scenario Outline: Login to Facebook with valid credentials
    Given User is on Login Web Page
    When User Enter '<EmailID>' as EmailID
    And User Enter '<password>' password Field
    And User click on Login
    Then User should be on Home Page
    And User closes browser

    Examples: 
      | EmailID                 | password |
      | atipune.soft@gmail.com  | abcd@123 |
      | atipune123@gmail.com    | efgh@123 |
      | atipune.soft2@gmail.com | ijkl@123 |
      | atipune.soft3@gmail.com | mnop@123 |

  @smoke @sanity
  Scenario Outline: Login to Facebook with valid credentials
    Given User is on Login Web Page
    When User Enter '<EmailID>' as EmailID
    And User Enter '<password>' password Field "‪C:\Users\HP\Desktop\CC1.xlsx"
    And User click on Login
    Then User should be on Home Page
    And User closes browser

    Examples: 
      | SheetName | Row_No | Column_NO |
      | Sheet1    |      0 |         1 |
      | Sheet1    |      1 |         1 |
      | Sheet1    |      2 |         1 |
      | Sheet1    |      3 |         1 |
