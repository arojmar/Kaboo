package serenitySteps;

import pages.KabooSignUpPage;
import pages.NewUserFormPage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class KabooSignUpSteps {

    private KabooSignUpPage getKabooSignUpPage() {
        return getPages().get(KabooSignUpPage.class);
    }

    private NewUserFormPage getNewUserFormPage() {
        return getPages().get(NewUserFormPage.class);
    }

    public void loadSignUpPage(){
        getKabooSignUpPage().goToSignUpPage();
    }

    public void customerClicksOnCreateAccountButton(){
        getKabooSignUpPage().customerClicksOnCreateAccountButton();
    }

    public void isUserOnSignUpPage() {
        getKabooSignUpPage().assertUserIsOnSignUpPage();
    }

    public void checkIfAllFieldsAreEmptyInForm(){
        getNewUserFormPage().checkAllFieldsAreEmpty();
    }

    public void introduceNewUser(){
        getNewUserFormPage().introductionOfNewUser();
    }

    public void checkAllNecessaryCheckboxes(){
        getNewUserFormPage().checkWishInfo();
        getNewUserFormPage().checkTermsAndConditions();
        getNewUserFormPage().checkGDPR();
    }

    public void userClickOnNextButton(){
        getKabooSignUpPage().clickOnNextButton();
    }
}
