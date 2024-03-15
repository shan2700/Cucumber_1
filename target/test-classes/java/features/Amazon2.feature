Feature: Amazon Login

  @S1
  Scenario: Amazon Login should be successful
    Given User should be in SignIn Page
    And User should enter "8825916026" in the Email or mobile phone number dialog
    And User should clicks on the Continue Button
    And User should enter the password as "Shan@2701"
    When User clicks on the Sign In button
    Then User should allow to login successful


    @S2
    Scenario: User should able to select the item
      Given User should be logined successfully
      And User clicks on the search box and enters "Samsung" in search box
      And User click search button
      When User click on the specific mobile
      Then selected item has shown successfully

