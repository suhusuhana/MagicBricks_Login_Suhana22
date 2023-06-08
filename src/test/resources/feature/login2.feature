Feature: login2

 Scenario Outline: Verify MagicBricksApp login functionality with invalid emailid
            Given Chrome is opened and MagicBricksApp is launched
            Then User navigates on Landing Page
            When User clicks on Login button 
            Then User Navigates to Login Page
            Then User enters incorrect Emailid "<WrongEmailid>"  
            Then User gets error message

Examples: 
         | WrongEmailid  |  
         | @@@@@         | 
        

  Scenario Outline: Verify MagicBricksApp login functionality with invalid password
            Given Chrome is opened and MagicBricksApp is launched
            Then User navigates on Landing Page
            When User clicks on Login button 
            Then User Navigates to Login Page
            When User enters correct EmailId  
            Then User enters incorrect Password "<password>"
            And  User clicks on Login Button
            Then User gets error message

Examples: 
          | password   |
          |   @@@      |
 
