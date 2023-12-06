Feature:verify product items

Background:
Given open the url of NopCom application

Scenario Outline:
When user enter valid username
When user enter valid password
And  click on signin button
Then user navigate to Homepage
When clik on customers link and click on product link
Then it navigate to product page
When enter product name as"<product>"
And click on serach button
Then particular record should be displayed

Examples:
|product|
|Apple MacBook Pro 13-inch|
|Windows 8 Pro|
|Computer Pro X|
