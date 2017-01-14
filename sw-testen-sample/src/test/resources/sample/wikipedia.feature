Feature: Search for Wikipedia article

Background:
  Given The Browsers language is "en"
  And I am on the wikipedia homepage
  When I select German
  Then the german startpage is shown with the title "Willkommen bei Wikipedia"

Scenario: Search for Software Testen
  And When I search for "Softwaretest"
  Then the article for a "Softwaretest" is shown

Scenario: Search for a non existing article
  And When I search for "Something else"
  Then the article for "Something else" should not exist
