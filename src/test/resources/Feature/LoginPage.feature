Feature: To Verify the Facebook Homepage
Scenario: To Verify the Facebook Homepage login with invalid credentials
Given User must be in Homepage of Facebook
When User should enter the username and password
And User should click the login button
Then User should verify the login error message