@Function @Login 
Feature: Login test

Background:
	Given Open chrome browser
	And Go to login page using URL
	
@Positive @Tool-2
Scenario: Successful login with valid username and valid password
	When Input valid username
	And Input valid password
	And Click Login button

	Then Login should be successful and the Logout button should be visible

@Negative1 @Tool-3
Scenario: Unsuccessful login with invalid username and invalid password
	When Input invalid username
	And Input invalid password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
@Negative2 @Tool-4
Scenario: Unsuccessful login with valid username and invalid password
	When Input valid username
	And Input invalid password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
@Negative3 @Tool-5
Scenario: Unsuccessful login with invalid username and valid password
	When Input invalid username
	And Input valid password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
@Negative4 @Tool-6
Scenario: Unsuccessful login with blank username and blank password
	When Input blank username
	And Input blank password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
@Negative5 @Tool-7
Scenario: Unsuccessful login with valid username and blank password
	When Input valid username
	And Input blank password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
@Negative6 @Tool-8
Scenario: Unsuccessful login with invalid username and blank password
	When Input invalid username
	And Input blank password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
@Negative7 @Tool-9
Scenario: Unsuccessful login with blank username and valid password
	When Input blank username
	And Input valid password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
@Negative8 @Tool-10
Scenario: Unsuccessful login with blank username and invalid password
	When Input blank username
	And Input invalid password
	And Click Login button

	Then Login should not be successful and the Logout button should not be visible
	
