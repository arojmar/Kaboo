package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utils.LoginEnv;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KabooLoginPage extends PageObject {

    @FindBy(css="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > h1")
    WebElementFacade headingLogIn;
    @FindBy(css="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > form > fieldset > div > div:nth-child(1) > input")
    WebElementFacade userName;
    @FindBy(css="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > form > fieldset > div > div:nth-child(2) > div.c-field__editable > input")
    WebElementFacade password;
    @FindBy(css="#submitLogin")
    WebElementFacade logInButton;
    @FindBy(css="body > div.s-app > div.s-app__page > ui-view > main > section.s-panel.s-lobby > main > div > div.m-promo > section > div > div > div.m-promo__body > h1")
    WebElementFacade headingLobby;

    public void loadLoginPage() {
        getDriver().navigate().to("https://qatest.staging.kaboo.com/gb/login");
    }

    public void assertUserIsOnLoginPage() {
        assertTrue(getDriver().getCurrentUrl().endsWith("/login"));
        assertFalse(headingLogIn.getText().isEmpty());
        assertTrue(userName.getText().isEmpty());
        assertTrue(password.getText().isEmpty());
        assertTrue(logInButton.isDisplayed());
    }

    public void fillUserNameAndPassword(){
        userName.sendKeys(Serenity.sessionVariableCalled("USER_NAME").toString());
        password.sendKeys(Serenity.sessionVariableCalled("PASSWORD").toString());
    }

    public void clickLogInButton(){
        logInButton.click();
    }

    public void assertUserIsInAccountPageProfile(){
        headingLobby.waitUntilVisible();
        assertTrue(getDriver().getCurrentUrl().endsWith("/lobby"));
        assertFalse(headingLobby.getText().isEmpty());
    }
}
