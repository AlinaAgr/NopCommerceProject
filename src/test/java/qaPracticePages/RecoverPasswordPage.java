package qaPracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RecoverPasswordPage extends BasePage{
    @FindBy (id = "forms")
    private WebElement formsMenu;

    @FindBy (xpath = "//*[@id=\"recover-password\"]")
    private WebElement recoverPasswordSubMenu;

    @FindBy (id = "email")
    private WebElement emailInput;

    @FindBy (id = "recover-password")
    private WebElement recoverPasswordButton;

    @FindBy (id = "message")
    private WebElement getMessage;

    public RecoverPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void actionOnRecoverPasswordPage(){
        clickOnFormsMenuAndRecoverPassword();
//        fillEmailInput();
//        clickOnRecoverPasswordButton();
//        getMessage();
    }

    public void clickOnFormsMenuAndRecoverPassword(){
        Actions actions = new Actions(driver);
        elementsHelper.clickElement(formsMenu);
        actions.click(recoverPasswordSubMenu).perform();
    }

    public void fillEmailInput(){
        elementsHelper.fillElement(emailInput, "admin@admin.com");
    }

    public void clickOnRecoverPasswordButton(){
        elementsHelper.clickElement(recoverPasswordButton);
    }

    public void getMessage(){
        System.out.println(getMessage.getText());
    }

    @Override
   public void isPageLoaded() {

    }
}
