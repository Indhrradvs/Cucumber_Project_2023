Feature: Test the login functionality of OrangeHRM

#Method-1

#Scenario: Test the valid Login
#Given user is on loginPage
#When user enters username and password
#And click on Login button
#Then user should land on home page

#Method-2

#Paremeterization- Passing values through Feature file 

 #Scenario: Test the valid Login

# Given user is on loginPage          
# When user enters "Admin" and "admin123"
# And click on Login button           
# Then user should land on home page  
 
  #Method-3 
 
 #Data Driver Testing in cucumber using scenario Outline - Passing values through Feature file 
 #if we have 2 credentials under Examples then it will try with 2, if we hv more it will continue to Max
 
 Scenario Outline: Test the valid login
 
 Given user is on loginPage          
 When user enters <username> and <password>
 And click on Login button           
 Then user should land on home page 
 
 Examples: 
			| username | password | 
      |    Admin | admin123 | 
      |    Admin1| admin1234|  


 