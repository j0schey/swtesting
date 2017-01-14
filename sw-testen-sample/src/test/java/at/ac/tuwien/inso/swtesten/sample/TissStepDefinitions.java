package at.ac.tuwien.inso.swtesten.sample;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by joschey on 12.01.17.
 */
public class TissStepDefinitions {

    TissSeleniumHelper tisspage = new TissSeleniumHelper();

    @Given("^I am on the main page of tiss$")
    public void i_am_on_the_main_page_of_tiss() throws Throwable {
        tisspage.setUp();
    }

    @Given("^I select the teaching section$")
    public void i_select_the_teaching_section() throws Throwable {
        tisspage.goToTeachingSection();
    }

    @When("^I select the course section$")
    public void i_select_the_course_section() throws Throwable {
        tisspage.selectCourseSection();
    }

    @Then("^the header \"([^\"]*)\" is shown$")
    public void the_header_is_shown(String arg1) throws Throwable {
        tisspage.assertHeaderShown(arg1);
    }

    @Then("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) throws Throwable {
        tisspage.search(arg1);
    }

    @Then("^The course page for \"([^\"]*)\" is shown$")
    public void the_course_page_for_is_shown(String arg1) throws Throwable {
        tisspage.assertCoursePageShown(arg1);
    }

    @Then("^The result list contains \"([^\"]*)\"$")
    public void the_result_list_contains(String arg1) throws Throwable {
        tisspage.assertListContains(arg1);
        tisspage.shutDown();
    }
}
