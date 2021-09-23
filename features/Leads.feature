Feature: Leads

Scenario Outline: Create lead
When Click on Create Lead 
Given Enter the company name as <company>
And Enter the first name as <fName>
And Enter the last name as <lName>
And Enter the phone number as <ph>
Then Click on submit button 
Examples:
|company|fName|lName|ph|
|'private'|'Muveen'|'Y'|'91'|
|'private'|'Bharath'|'B'|'98'|


Scenario Outline: Edit Lead
When Click on Find Leads button
And Click on Phone
And Enter the search phone number as <ph>
Then Click on Find Leads button
And Click on first displayed result
And Click on edit button
And Enter the update company name as <cName>
Then Click on submit button
Examples:
|ph|cName|
|'91'|'TCS'|
|'98'|'WIPRO'|

Scenario Outline: Duplicate Lead
When Click on Find Leads button
And Click on Phone
And Enter the search phone number as <ph>
Then Click on Find Leads button
And Click on first displayed result
And Click on duplicate lead button
Then Click on submit button
Examples:
|ph|
|'91'|
|'98'|

Scenario Outline: Merge Leads
When Click on merge leads
And Enter first name as <fName>
And Get the leadID of first result
And Click on first displayed result
And Switch to window handle
And Enter the second name as <sName>
And Click on first displayed result
And Switch to main window handle
And Click on merge button
Then Click on Find Leads button
And Enter the input name as leadID
And Verify the result
Examples:
|fName|sName|
|'Muveen'|'Bharath'|

Scenario Outline: Delete Lead
When Click on Find Leads button
And Click on Phone
And Enter the search phone number as <ph>
Then Click on Find Leads button
And Get the leadID of first result
And Click on first displayed result
And Click on delete button
Then Click on Find Leads button
And Enter the input name as leadID
And Click on Find Leads button
And Verify the deleted result
Examples:
|ph|
|'91'|
|'98'|



 

