Feature: Adding two numbers

  Scenario Outline: Add two numbers
    Given I have entered <number1> and <number2>
    When I add them
    Then the result should be <sum>

    Examples:
      | number1 | number2 | sum |
      | 2       | 3       | 5   |
      | 5       | 7       | 12  |