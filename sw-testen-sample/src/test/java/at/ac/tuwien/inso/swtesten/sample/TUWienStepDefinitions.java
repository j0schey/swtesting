package at.ac.tuwien.inso.swtesten.sample;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TUWienStepDefinitions {

	private TUWienSeleniumHelper tupage = new TUWienSeleniumHelper();
	
	@Given("^I want to look up the definition of the master courses at Vienna University of Technology$")
	public void I_want_to_look_up_the_definition_of_the_master_courses_at_Vienna_University_of_Technology() throws Throwable {
		tupage.setUp();
	}

	@When("^I select the Master courses in the teaching section$")
	public void I_select_the_Master_courses_in_the_teaching_section() {
		tupage.goToTeachingAndMasterCourses();
	}

	@When("^When I select the course \"([^\"]*)\"$")
	public void When_I_select_the_course(String course) {
		tupage.selectCourse(course);
	}

	@Then("^the definition of this course is shown$")
	public void the_definition_of_this_course_is_shown() {
		tupage.assertDefinition();
		tupage.shutDown();
	}
}
