package qaPracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class ShippingDetailsPage extends BasePage{
    @FindBy (id = "phone")
    private WebElement phoneInput;

    @FindBy (xpath = "//*[@id=\"shippingForm\"]/div[2]/input")
    private WebElement streetInput;

    @FindBy (xpath = "//*[@id=\"shippingForm\"]/div[3]/input")
    private WebElement cityInput;

    @FindBy (xpath = "//*[@id=\"countries_dropdown_menu\"]")
    private WebElement countryInput;

    @FindBy (id = "submitOrderBtn")
    private WebElement submitButton;

    @FindBy (id = "message")
    private WebElement confirmationMessage;

    public ShippingDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void fillCheckOutForm(){
        fillPhoneInput();
        fillStreetInput();
        fillCityInput();
        fillCountryInput();
        clickOnSubmitButton();
        getValidationMessage();
        logEvents(PASS_STEP, "Adding check out details and confirm order");
    }

    public void fillPhoneInput(){
        elementsHelper.fillElement(phoneInput, "0385832843");
    }

    public void fillStreetInput(){
        elementsHelper.fillElement(streetInput, "Marului");
    }

    public void fillCityInput(){
        elementsHelper.fillElement(cityInput, "Bucuresti");
    }

    public void fillCountryInput(){
        elementsHelper.fillElement(countryInput, "Romania");
    }

    public void clickOnSubmitButton(){
        elementsHelper.clickElement(submitButton);
    }

    public void getValidationMessage(){
        System.out.println(confirmationMessage.getText());
    }

    @Override
    public void isPageLoaded() {
    }
}
