package serenitySteps;

import pages.ContinueUserFormPage;
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
    private ContinueUserFormPage getContinueUserFormPage() {
        return getPages().get(ContinueUserFormPage.class);
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

    public void checkIfNewUserFormFieldsAreEmpty(){
        getNewUserFormPage().checkAllFieldsAreEmpty();
    }

    public void introduceNewUser(){
        getNewUserFormPage().introductionOfNewUser();
    }

    public void checkFormUserNecessaryCheckboxes(){
        getNewUserFormPage().checkWishInfo();
        getNewUserFormPage().checkTermsAndConditions();
        getNewUserFormPage().checkGDPR();
    }

    public void userClickOnNextButton(){
        getKabooSignUpPage().clickOnNextButton();
    }

    public void checkIfContinueUserFormFieldsAreEmpty(){
        getContinueUserFormPage().checkContinueFormFieldsAreEmpty();
    }

    public void continueWithNewUser(){
        getContinueUserFormPage().continuationOfNewUser();
    }

    public void registerButtonIsEnabledAndClickable(){
        getContinueUserFormPage().checkIfRegisterButtonIsEnabled();
        getContinueUserFormPage().clickInRegisterButton();
    }
}
