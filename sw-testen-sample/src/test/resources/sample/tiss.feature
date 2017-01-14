Feature: Search courses on TISS

Background:
  Given I am on the main page of tiss
  And I select the teaching section
  When I select the course section
  Then the header "Lehrangebot" is shown

Scenario: Search for course number
  And I search for "183.290"
  Then The course page for "183.290 Software Testing" is shown

Scenario: Search for course name
  When I select the course section
  And I search for "Testing"
  Then The result list contains "183.290"