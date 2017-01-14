package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by joschey on 14.01.17.
 */
public class AccountInformationStepDefinitions {

    AccountInformationSeleniumHelper page = new AccountInformationSeleniumHelper();

    @Given("^I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithUsernameAndPassword(String arg0, String arg1) throws Throwable {
        page.setUp();
        page.login();
    }

    @When("^I navigate to my profile$")
    public void iNavigateToMyProfile() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I change my address to \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iChangeMyAddressTo(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I confirm my address changes$")
    public void iConfirmMyAddressChanges() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can see my new address on my profile$")
    public void iCanSeeMyNewAddressOnMyProfile() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
