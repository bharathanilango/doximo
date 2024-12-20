@tag
Feature: verifying the facebook login

Scenario: verfying the facebook login page with invalid credentials

Given User is on login page
When User enters the username,password and click login button
Then User get success message

Scenario: verfying the facebook login page with invalid credentials1

Given User is on login page1
When User enters the username,password and click login button1
Then User get success message1