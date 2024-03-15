Feature: facebook_login

   Scenario:  Login with invalid credentials
    Given user navigate to login page of facebook
    When  user enter the invalid credentials
    And   hits login button
    Then  the user should see error message

@google_url
   Scenario: login google
    Given  user navigate to google home page