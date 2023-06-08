Feature: login_Excel

 Scenario Outline: Verify MagicBricksApp login functionality with invalid emailid
            Given Chrome is opened and MagicBricksApp is launched
            Then User navigates on Landing Page
            When User clicks on Login button 
            Then User Navigates to Login Page
            Then User enters correct Emailid and password from sheetname "<SheetName>" and rownumber <RowNumber>
            Then User gets message your loggedin

Examples: 
    | SheetName      | RowNumber |
    | Sheet1         |         0 |
    | Sheet1         |         1 |

  #Scenario Outline: Verify MagicBricksApp login functionality with invalid password
#            Given Chrome is opened and MagicBricksApp is launched
            #Then User navigates on Landing Page
            #When User clicks on Login button 
#            Then User Navigates to Login Page
            #When User enters correct EmailId  from sheetname "<SheetName>" and rownumber <RowNumber>
            #Then User enters incorrect Password from sheetname "<SheetName>" and rownumber <RowNumber> 
            #And  User clicks on Login Button
            #Then User gets error message
#
#Examples: 
#    | SheetName | RowNumber |
    #| Sheet2    |         0 |
    #| Sheet2    |         1 |
