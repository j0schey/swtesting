Feature: Account Information

  Scenario: I have moved and want to change my address information
    #enter your account credentials
    Given I login with username "<YOUR_USERNAME>" and password "<YOUR_PASSWORD>"
    When I navigate to my profile
	And I change my address to "Gußhausstraße 28", "1040", "Vienna", "Austria"
	And I confirm my address changes
	Then I can see my new address on my profile