Feature: Amazon_login

  Scenario Outline: Login with valid credentials
    Given user navigate to login page of amazon
    When  user enter the <username> and <password>
    And   hits signup button
    Then  the user should login into amazon
    Examples:
      |  username  | password   |
      | 8825916026 | Shan@2701  |
      | 8825916026 | Shan@2701  |