package qaPracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class RegisterFormPage extends BasePage{
    @FindBy (id = "forms")
    private WebElement formsMenu;

    @FindBy (id = "register")
    private WebElement registerSubMenu;

    @FindBy (id = "firstName")
    private WebElement newUserFirstName;

    @FindBy (id = "lastName")
    private WebElement newUserLastName;

    @FindBy (id = "phone")
    private WebElement newUserPhoneNumber;

    @FindBy (id = "countries_dropdown_menu")
    private WebElement newUserCountry;

    @FindBy (id = "emailAddress")
    private WebElement newUserEmail;

    @FindBy (id = "password")
    private WebElement newUserPassword;

    @FindBy (id = "exampleCheck1")
    private WebElement termsAndConditions;

    @FindBy (id = "registerBtn")
    private WebElement submitButton;

    @FindBy (id = "message")
    private WebElement validationMessage;

    public RegisterFormPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void registerFormPageActions(){
        clickOnFormsMenuAndRegisterSubMenu();
        fillFirstNameInput();
        fillLastNameInput();
        fillPhoneNumberInput();
        fillCountryInput();
        fillEmailAddressInput();
        fillPasswordInput();
        checkTermsAndConditions();
        clickOnSubmitButton();
        getValidationMessage();
        logEvents(PASS_STEP, "Filling the form with new user values");
    }

    public void clickOnFormsMenuAndRegisterSubMenu(){
        elementsHelper.clickElement(formsMenu);
        actions.click(registerSubMenu).perform();
    }

    public void fillFirstNameInput(){
        actions.scrollToElement(newUserFirstName).perform();
        elementsHelper.fillElement(newUserFirstName, "Alina");

    }

    public void fillLastNameInput(){
        actions.scrollToElement(newUserLastName).perform();
        elementsHelper.fillElement(newUserLastName, "Alina");
    }

    public void fillPhoneNumberInput(){
        actions.scrollToElement(newUserPhoneNumber).perform();
        elementsHelper.fillElement(newUserPhoneNumber, "0730024020");
    }

    public void fillCountryInput(){
        actions.scrollToElement(newUserCountry).perform();
        elementsHelper.fillElement(newUserCountry, "Romania");
    }

    public void fillEmailAddressInput(){
        actions.scrollToElement(newUserEmail).perform();
        elementsHelper.fillElement(newUserEmail, "alinatester@gmail.com");
    }

    public void fillPasswordInput(){
        actions.scrollToElement(newUserPassword).perform();
        elementsHelper.fillElement(newUserPassword, "alinatester");
    }

    public void checkTermsAndConditions(){
        actions.scrollToElement(termsAndConditions).perform();
        elementsHelper.clickElement(termsAndConditions);
    }

    public void clickOnSubmitButton(){
        actions.scrollToElement(submitButton).perform();
        elementsHelper.clickElement(submitButton);
    }

    public void getValidationMessage(){
        System.out.println(validationMessage.getText());
    }

    @Override
   public void isPageLoaded() {
    }
}
