Feature: Look up course definitions

Scenario: Look up the definition of the Masters Course - Software Engineering & Internet Computing
Given I want to look up the definition of the master courses at Vienna University of Technology
When I select the Master courses in the teaching section
And When I select the course "Masterstudium Software Engineering & Internet Computing"
Then the definition of this course is shown