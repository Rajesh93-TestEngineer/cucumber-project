Feature: Verify complete login functional

Scenario: Verify login functionality with login Valid Crendentails

Given open the url of login functionality
When  Enter username and password
And   click on Login button
Then  user Navigate to Home page


Scenario: Verify login functionality with login InValid Crendentails

Given open the url of login functionality
When  User Enter InValidUserName and Enter InValidPassword
And   Click on Login btn
Then  Its throws Error invalid Username and Invalid Password