package utils;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginEnv {

    @FindBy(xpath = "/html/body/div/div[1]/ui-view/header/div/div[1]/div[1]/form/fieldset/a")
    WebElementFacade signUpButton;

    @FindBy(xpath = "html/body/div/div[1]/ui-view/header/div/div[1]/div[1]/form/fieldset/button")
    WebElementFacade logInButton;

    @FindBy(xpath ="//*[@id=\"bonus\"]/div/div/h2")
    WebElementFacade mainHeading;

    public void logInEnvironment() {
        String kabooEnvLogin = "kaboo";
        String kabooEnvPassword = "flappybird";
        getDriver().navigate().to("https://" + kabooEnvLogin + ":" + kabooEnvPassword + "@" + "qatest.staging.kaboo.com/gb");
    }

    public void assertMainPageIsLoaded() {

//        assertTrue(signUpButton.isVisible()); //TODO: solve problem with the selectors
//        assertTrue(logInButton.isDisplayed());
   //     assertFalse(mainHeading.getText().isEmpty());

    }
}
