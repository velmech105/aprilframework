Feature: Demosite Registration Page


Scenario: Validate Registration form
Given User launches chrome  browser and open a test URL "http://demo.automationtesting.in/Register.html"
When User click firstname textbox and enter a value "Test FirstName"
And User click lastname textbox and enter a value "Test lastname"
And User click Address textbox and enter a value "Test Address"
And User click email textbox and enter a value "Test email"
And User clcik phone number textbox and enter a value "1989645"
And User click "Male" radio button
Then user validate "Male" radiobutton is selected
When User click "FeMale" radio button
Then user validate "FeMale" radiobutton is selected
When User click movie checkbox 
Then Usser validate movie checkbox is checked

