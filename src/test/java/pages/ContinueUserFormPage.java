package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContinueUserFormPage extends PageObject {


    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form2.is-visible > fieldset > div > div.c-field.c-field--registration-first-name > input")
    WebElementFacade firstName;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form2.is-visible > fieldset > div > div.c-field.c-field--registration-last-name > input")
    WebElementFacade surname;
    @FindBy(css = "#days")
    WebElementFacade dayOfBirth;
    @FindBy(css = "#months")
    WebElementFacade monthOfBirth;
    @FindBy(css = "#years")
    WebElementFacade yearOfBirth;
    @FindBy(css = "#sexMale")
    WebElementFacade genderMale;
    @FindBy(css = "#sexFemale")
    WebElementFacade genderFemale;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form2.is-visible > fieldset > div > div.c-field.c-field--registration-address > input")
    WebElementFacade address;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form2.is-visible > fieldset > div > div.c-field.c-field--registration-postcode > input")
    WebElementFacade postcode;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form2.is-visible > fieldset > div > div.c-field.c-field--registration-city > input")
    WebElementFacade city;
    @FindBy(xpath = "//*[@id=\"countrySelector\"]/div")
    WebElementFacade country;
    @FindBy(css = "#currencySelector > div > span")
    WebElementFacade currency;
    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form2.is-visible > fieldset > div > div.c-field.c-field--registration-phone > input")
    WebElementFacade phone;

    @FindBy(css = "body > div > div.s-app__page > ui-view > div > main > div > div > div > div > div > div > div > div > div > form > div.m-auth-registration__form2.is-visible > div > button")
    WebElementFacade registrationButton;


    public void checkContinueFormFieldsAreEmpty() {
        assertTrue(firstName.getText().isEmpty());
        assertTrue(surname.getText().isEmpty());
        assertTrue(dayOfBirth.getText().isEmpty());
        assertTrue(monthOfBirth.getText().isEmpty());
        assertTrue(yearOfBirth.getText().isEmpty());
//        if(Serenity.sessionVariableCalled("GENDER").toString() == "M"){
//            assertFalse(genderMale.isSelected());
//        } else {
//            assertFalse(genderFemale.isSelected());
//        }
        assertTrue(address.getText().isEmpty());
        assertTrue(postcode.getText().isEmpty());
        assertTrue(city.getText().isEmpty());
        assertTrue(phone.getText().isEmpty());
    }

    public void continuationOfNewUser() {
        //TODO Some of the elements can not be found
        firstName.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("NAME").toString());
        surname.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("SURNAME").toString());
        dayOfBirth.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("DAY_OF_BIRTH").toString());
        monthOfBirth.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("MONTH_OF_BIRTH").toString());
        yearOfBirth.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("YEAR_OF_BIRTH").toString());
//        if(Serenity.sessionVariableCalled("GENDER").toString() == "M"){
//            genderMale.waitUntilClickable().click();
//        } else {
//            genderFemale.waitUntilClickable().click();
//        }
        address.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("ADDRESS").toString());
        postcode.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("POSTCODE").toString());
        city.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("CITY").toString());
        country.waitUntilClickable().click();

//        country.selectByVisibleText(Serenity.sessionVariableCalled("COUNTRY").toString());
//        currency.waitUntilClickable().selectByVisibleText(Serenity.sessionVariableCalled("CURRENCY").toString());
        phone.waitUntilEnabled().sendKeys(Serenity.sessionVariableCalled("PHONE").toString());
    }

    public void checkIfRegisterButtonIsEnabled() {
        assertTrue(registrationButton.waitUntilEnabled().isEnabled());
    }

    public void clickInRegisterButton() {
        registrationButton.waitUntilClickable().click();
    }
}

