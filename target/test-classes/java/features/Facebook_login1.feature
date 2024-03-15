Feature: Facebook_login1

Background:
   Given user navigate to login page of facebook

  Scenario Outline: Login with valid credentials
    When  user enter  <username> and <password>
    And   hits login button
    Then  the user should login into facebook
    Examples:
      |  username              |  password  |
      | shanthosh272@gmail.com | Shan@2701  |
      | shanthosh272@gmail.com | Shan@2701  |