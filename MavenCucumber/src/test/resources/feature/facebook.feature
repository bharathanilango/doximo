Feature: verify the facebook login

Scenario: verify the login page by invalid cretential

Given user is on login page 
When user enters the username,password and click the login button
Then User get success message