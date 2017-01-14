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

    @Given("^\\[AccountInformation\\] I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithUsernameAndPassword(String arg0, String arg1) throws Throwable {
        page.setUp();
    }

    @When("^I navigate to my profile$")
    public void iNavigateToMyProfile() throws Throwable {
        page.showProfile();
    }

    @And("^I change my address to \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iChangeMyAddressTo(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        page.setProfileFields(arg0, arg1, arg2, arg3);
    }

    @And("^I confirm my address changes$")
    public void iConfirmMyAddressChanges() throws Throwable {
        page.submitProfileChanges();
    }

    @Then("^I can see my new address \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" on my profile$")
    public void iCanSeeMyNewAddressOnMyProfile(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        System.out.printf("args: " + arg0, arg1, arg2, arg3);

        page.assertProfileChanges(arg0, arg1, arg2, arg3);
        page.shutDown();
    }
}
