package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;


import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KabooSignUpPage extends PageObject {

    @FindBy(css = "body > div > div.s-app__page > ui-view > header > div > div.m-navigation-login > div:nth-child(1) > form > fieldset > a")
    WebElementFacade createAccountButton;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > h1")
    WebElementFacade headingRegistration;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > div > button")
    WebElementFacade nextButton;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > div > button >span")
    WebElementFacade spanNextButton;

    public void customerClicksOnCreateAccountButton(){
            createAccountButton.isEnabled();
            createAccountButton.click();
    }

    public void goToSignUpPage(){
        getDriver().navigate().to("https://qatest.staging.kaboo.com/gb/signup");
    }

    public void assertUserIsOnSignUpPage(){

        assertTrue(getDriver().getCurrentUrl().endsWith("https://qatest.staging.kaboo.com/gb/signup"));
        assertFalse(headingRegistration.getText().isEmpty());
        assertTrue(nextButton.isEnabled());
    }

    public void clickOnNextButton(){
        assertTrue("The button is not enabled", nextButton.isEnabled());
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click();", nextButton);
        //needed the javascript for checking the button
    }
}
