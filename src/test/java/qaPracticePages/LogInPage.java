package qaPracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class LogInPage extends BasePage{
    @FindBy (id = "email")
    private WebElement emailInput;

    @FindBy (id = "password")
    private WebElement passwordInput;

    @FindBy (id = "submitLoginBtn")
    private WebElement submitButton;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void logInForm(){
        fillEmailInput();
        fillPasswordInput();
        clickOnSubmitButton();
        logEvents(PASS_STEP, "Log In with existing values");
    }

    public void fillEmailInput(){
        elementsHelper.fillElement(emailInput, "admin@admin.com");
    }

    public void fillPasswordInput(){
        elementsHelper.fillElement(passwordInput, "admin123");
    }

    public void clickOnSubmitButton(){
        elementsHelper.clickElement(submitButton);
    }

    @Override
    public void isPageLoaded() {
    }
}
