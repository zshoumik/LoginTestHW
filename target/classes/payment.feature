Feature: Payment function testing

Scenario: As a smart banking user,I need to check payment function with valid information

Given Login application
When add valid credit card information
When Click payment button
Then validate payment go successfully
