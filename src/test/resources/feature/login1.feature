Feature: login1
 
    Scenario:    UI
                Given Chrome is opened and MagicBricksApp is launched
                Then User navigates on Landing Page
                When User clicks on Login button 
               Then User Navigates to Login Page

   Scenario:    Field validation
             Given Chrome is opened and MagicBricksApp is launched
               Then User navigates on Landing Page
                When User clicks on Login button 
                Then User Navigates to Login Page
                And elements are enabled on Login Page

  Scenario:     Main functionality
            Given Chrome is opened and MagicBricksApp is launched
            Then User navigates on Landing Page
            When User clicks on Login button 
            Then User Navigates to Login Page
            When User enters correct EmailId  
            Then User enters correct Password 
            And User clicks on Login Button
            Then User shows on Home Page