@productScenario
Feature: EndToEnd TestMeApp
Login with linda User and purchase product and complete payment Process.

Background: Login With valid user Credentials
Given user is on home page
When Linda enters username and pssword and Click on Login button
Then Linda should be logged in and verified

@AddtoCartandPaymentProcess
Scenario: Successfull Checkout
Given Navigate to all Categories - electronics and headphone  
And Add product into shopping cart
When Proceed to checkout
And Select the bank and add Credentials 
Then Redirected to the Thank you page
