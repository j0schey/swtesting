package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by joschey on 14.01.17.
 */
public class PaymentMethodStepDefinitions {

    @Given("^\\[PaymentMethods\\] I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void paymentmethodsILoginWithUsernameAndPassword(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I navigate to my payment methods$")
    public void iNavigateToMyPaymentMethods() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I choose to add a new credit card with number \"([^\"]*)\", owner \"([^\"]*)\" and valid thru date \"([^\"]*)\" \"([^\"]*)\"$")
    public void iChooseToAddANewCreditCardWithNumberOwnerAndValidThruDate(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I confirm my payment changes$")
    public void iConfirmMyPaymentChanges() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^there is a new credit card present in my payment methods$")
    public void thereIsANewCreditCardPresentInMyPaymentMethods() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
