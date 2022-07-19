Feature: Demosite Registeration Page


Scenario: Validate Registeration form
Given  User launches chrome browser and open a test URL "http://demo.automationtesting.in/Register.html"
When  User click firstname textbox and enter a value "Test FirstName"
And   User click lastname textbox and enter a value "Test LastName"
And   User click address textbox and enter a value "Test Address"
And   User click email textbox and enter a value "Test Email"
And   User click phone number textbox and enter a value "123456"
And   User click "Male" radio button
Then  user validate "FeMale" radiobutton is selected
When  User click "FeMale" radio button
Then  user validate "FeMale" radiobutton is selected
When  User click movie checkbox
Then  User validate movie ckeckbox is checked
 
