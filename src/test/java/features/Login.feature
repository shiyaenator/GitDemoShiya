Feature: Application Login
Scenario: Home page default Login
Given user is on netbanking login page
When user logs into application with username and password
Then home page is displayed
And card details are displayed