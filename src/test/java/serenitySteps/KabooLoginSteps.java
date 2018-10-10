package serenitySteps;

import pages.KabooLoginPage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class KabooLoginSteps {

    private KabooLoginPage getKabooLoginPage(){ return getPages().get(KabooLoginPage.class); }

    public void loadLoginPage(){
        getKabooLoginPage().loadLoginPage();
    }

    public void assertUserIsOnLoginPage(){
        getKabooLoginPage().assertUserIsOnLoginPage();
    }

    public void fillUserNameAndPassword(){
        getKabooLoginPage().fillUserNameAndPassword();
    }

    public void clickLogInButton(){
        getKabooLoginPage().clickLogInButton();
    }

    public void assertUserIsInAccountPageProfile(){
        getKabooLoginPage().assertUserIsInAccountPageProfile();
    }
}
