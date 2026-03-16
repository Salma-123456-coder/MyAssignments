Feature: Account name verification in Salesforce 
Scenario: Account name creation and verification in Salesforce
   
    
Given : launch the browser
Given : load the url
When  : enter the Username
When  : enter the Password
When  : Click on the Login button
Then  : it will navigate to the Home page 
When  : Click on the toggle menu
And   : Click View All
And   : Click Sales from App Launcher
And   : Click on Accounts tab
And   : Click on New button
And   : Enter 'your name' as account name
And   : Select Ownership as Public 
And   : Click save 
Then  : verify Account name
