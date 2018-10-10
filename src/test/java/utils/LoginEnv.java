package utils;

import net.serenitybdd.core.Serenity;
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

    @FindBy(xpath = "//*[@id=\"bonus\"]/div/div/h2")
    WebElementFacade mainHeading;

    public void logInEnvironment() {
        String kabooEnvLogin = "kaboo";
        String kabooEnvPassword = "flappybird";
        storeUserNotRegistered();
        getDriver().navigate().to("https://" + kabooEnvLogin + ":" + kabooEnvPassword + "@" + "qatest.staging.kaboo.com/gb");
    }

    private void storeUserNotRegistered(){

        Serenity.setSessionVariable("USER_NAME").to("test_email");
        Serenity.setSessionVariable("EMAIL").to("test_email@email.com");
        Serenity.setSessionVariable("PASSWORD").to("Test12345");
        Serenity.setSessionVariable("NAME").to("TestName");
        Serenity.setSessionVariable("SURNAME").to("TestSurname");
        Serenity.setSessionVariable("DAY_OF_BIRTH").to("01");
        Serenity.setSessionVariable("MONTH_OF_BIRTH").to("01");
        Serenity.setSessionVariable("YEAR_OF_BIRTH").to("1980");
        Serenity.setSessionVariable("GENDER").to("M");
        Serenity.setSessionVariable("ADDRESS").to("1 Marbella Street");
        Serenity.setSessionVariable("POSTCODE").to("01000");
        Serenity.setSessionVariable("CITY").to("Munich");
        Serenity.setSessionVariable("COUNTRY").to("GERMANY");
        Serenity.setSessionVariable("CURRENCY").to("EURO");
        Serenity.setSessionVariable("PHONE").to("612345678");

    }


//    public void assertMainPageIsLoaded() {
//
//        assertTrue(signUpButton.isVisible()); //TODO: solve problem with the selectors
//        assertTrue(logInButton.isDisplayed());
//        assertFalse(mainHeading.getText().isEmpty());
//
//    }
}
