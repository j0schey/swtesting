Feature: Payment Methods

  Scenario Outline: I want to add a new credit card to my payment methods
  #enter your account credentials
    Given I login with username "<YOUR_USERNAME>" and password "<YOUR_PASSWORD>"
    When I navigate to my payment methods
	And I choose to add a new credit card with number "<account>", owner "<owner>" and valid thru date "<month>" "<year>"
	And I confirm my payment changes
	Then there is a new credit card present in my payment methods

    Examples:
      | account          | owner              | month | year |
      | 1234000077779900 | Karl Mayer         | 11    | 2019 |
      | 1111444477775555 | Johanna Hohenegger | 1     | 2025 |