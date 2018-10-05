package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NewUserFormPage extends PageObject {

    @FindBy(css ="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > fieldset > div > div:nth-child(1) > input")
    WebElementFacade email;
    @FindBy(css ="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > fieldset > div > div:nth-child(2) > input")
    WebElementFacade username;
    @FindBy(css ="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > fieldset > div > div:nth-child(3) > div > input")
    WebElementFacade password;
    @FindBy(css ="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > fieldset > div > div:nth-child(4) > div > input")
    WebElementFacade repeatPassword;
    @FindBy(css ="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > fieldset > div > ko-gdpr > div > div:nth-child(8)")
    WebElementFacade wishInfoCheckbox;
    @FindBy(css ="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > fieldset > div > ko-gdpr > div > div:nth-child(7)")
    WebElementFacade termsAndConditions;
    @FindBy(css ="body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form1 > fieldset > div > ko-gdpr > div > div:nth-child(13) > label > span > span")
    WebElementFacade GDPRCheckbox;

    public void checkAllFieldsAreEmpty(){
        assertTrue(email.getText().isEmpty());
        assertTrue(username.getText().isEmpty());
        assertTrue(password.getText().isEmpty());
        assertTrue(repeatPassword.getText().isEmpty());
        assertFalse(wishInfoCheckbox.isSelected());
        assertFalse(termsAndConditions.isSelected());
        assertFalse(GDPRCheckbox.isSelected());
    }

    public void introductionOfNewUser(){
        email.sendKeys("test_email@email.com");
        username.sendKeys("test_email");
        password.sendKeys("Test1234");
        repeatPassword.sendKeys("Test1234");
    }

    public void checkWishInfo(){
        wishInfoCheckbox.click();
    }

    public void checkTermsAndConditions(){
        termsAndConditions.click();
    }

    public void checkGDPR(){
        GDPRCheckbox.click();
    }

}
