package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitySteps.KabooLoginSteps;
import utils.LoginEnv;

public class KabooLoginDefinitions {

    @Steps
    LoginEnv loginEnv;

    @Steps
    KabooLoginSteps kabooLoginSteps;


    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        loginEnv.getUserRegistered();
        loginEnv.logInEnvironment();
        kabooLoginSteps.loadLoginPage();
        kabooLoginSteps.assertUserIsOnLoginPage();
    }


    @When("^fills username/password$")
    public void fills_username_password() {
        kabooLoginSteps.fillUserNameAndPassword();
    }

    @When("^clicks Log in button$")
    public void clicks_Log_in_button() {
        kabooLoginSteps.clickLogInButton();

    }

    @Then("^user should be redirected to account page profile$")
    public void user_should_be_redirected_to_account_page_profile() {
        kabooLoginSteps.assertUserIsInAccountPageProfile();
    }

}
