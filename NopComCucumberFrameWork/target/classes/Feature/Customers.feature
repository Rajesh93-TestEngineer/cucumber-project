Feature: Verify customers link

Scenario: Verify admine login  functionality

Given open the browser
When  Enter valid username and  valid password
And   click on login button
Then  user go to Homepage
When clik on customers option
And  click on customer
And  click on Add New button
When Enter valid Email and Valid Password
When Enter valid FirstName and Vaild Lastname
And  click on Male Radio butn
When click on particular date
Then click on save butn
#Then new customer add successfully