Feature: ATM Transactions

Scenario: Withdraw money with a valid card
Given the user inserts a valid ATM card
When the user enters their PIN
And selects the "Withdraw" option
And enters the withdrawal amount
And confirms the transaction
Then money should be dispensed