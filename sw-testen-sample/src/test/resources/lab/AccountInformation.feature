Feature: Account Information

  Scenario: I have moved and want to change my address information
    #enter your account credentials
    Given [AccountInformation] I login with username "User14.02@mail.com " and password "Testing14_d351"
    When I navigate to my profile
	And I change my address to "Gußhausstraße 28", "1040", "Vienna", "Austria"
	And I confirm my address changes
	Then I can see my new address "Gußhausstraße 28", "1040", "Vienna", "Austria" on my profile