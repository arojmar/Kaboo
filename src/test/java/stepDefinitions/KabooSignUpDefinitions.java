package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitySteps.KabooSignUpSteps;
import utils.LoginEnv;

public class KabooSignUpDefinitions {

    @Steps
    LoginEnv loginEnv;

    @Steps
    KabooSignUpSteps kabooSignUpSteps;

    @Given("^user is on signup page$")
    public void user_is_on_signup_page() {
       loginEnv.storeUserNotRegistered();
       loginEnv.logInEnvironment();
       kabooSignUpSteps.loadSignUpPage();
//       kabooSignUpSteps.customerClicksOnCreateAccountButton(); // TODO: Solve issue of when click and go and back to the signup page
       kabooSignUpSteps.isUserOnSignUpPage();
    }

    @When("^fills all fields with valid data on step 1$")
    public void fills_all_fields_with_valid_data_on_step() {
        kabooSignUpSteps.checkIfNewUserFormFieldsAreEmpty();
        kabooSignUpSteps.introduceNewUser();
        kabooSignUpSteps.checkFormUserNecessaryCheckboxes();
    }

    @When("^clicks NEXT$")
    public void clicks_NEXT() {
        kabooSignUpSteps.userClickOnNextButton();
    }

    @When("^fills all fields with valid data from step 2$")
    public void fills_all_fields_with_valid_data_from_step() {
        kabooSignUpSteps.checkIfContinueUserFormFieldsAreEmpty();
        kabooSignUpSteps.continueWithNewUser();


    }

    @Then("^register button is enable and clickable$")
    public void register_button_is_enable_and_clickable() {
        kabooSignUpSteps.registerButtonIsEnabledAndClickable();
    }
}
