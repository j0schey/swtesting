package at.ac.tuwien.inso.swtesten.sample;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WikipediaStepDefinitions {
	
	private WikipediaSeleniumHelper wikitest = new WikipediaSeleniumHelper();

	@Given("^The Browsers language is \"([^\"]*)\"$")
	public void the_Browsers_language_is(String locale) throws Throwable {
		wikitest.setBrowserLanguage(locale);
	}

	@And("^I am on the wikipedia homepage$")
	public void I_am_on_the_wikipedia_homepage() throws Throwable {
	    wikitest.setUp();
	}

	@When("^I select German$")
	public void I_select_German() throws Throwable {
		wikitest.selectLanguage();
	}

	@Then("^the german startpage is shown with the title \"([^\"]*)\"$")
	public void the_german_startpage_is_shown_with_the_title(String arg1) throws Throwable {
	   wikitest.assertStartPageText(arg1);
	}

	@Then("^When I search for \"([^\"]*)\"$")
	public void When_I_search_for(String arg1) throws Throwable {
		
		wikitest.search(arg1);
	}

	@Then("^the article for a \"([^\"]*)\" is shown$")
	public void the_article_for_a_is_shown(String arg1) throws Throwable {
	    wikitest.assertSearchResult(arg1);
	    wikitest.shutDown();
	}
	
	@Then("^the article for \"([^\"]*)\" should not exist$")
	public void the_article_for_should_not_exist(String arg1) throws Throwable {
		wikitest.assertThatArticleNotExists(arg1);
		wikitest.shutDown();
	}
}