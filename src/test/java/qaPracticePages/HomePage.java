package qaPracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class HomePage extends BasePage{
    @FindBy (id = "forms")
    private WebElement formsMenu;

    @FindBy (id = "register")
    private WebElement registerSubMenu;

    @FindBy (id = "recover-password")
    private WebElement recoverPasswordSubMenu;

    @FindBy (id = "login")
    private WebElement logInSubMenu;

    @FindBy (id = "home")
    private WebElement homePageButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);   //Creem instanta globala de Actions

    public void goBackToHomePage(){
        elementsHelper.clickElement(homePageButton);
        logEvents(INFO_STEP, "Method to go on the Home Page after every flow");

    }

    public void clickOnFormsMenuAndRegisterSubMenu(){
        elementsHelper.clickElement(formsMenu);
        actions.click(registerSubMenu).perform();
    }

//    public void clickOnFormsMenuAndRecoverPassword(){
//        elementsHelper.clickElement(formsMenu);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(recoverPasswordSubMenu).perform();
//    }
//
    public void clickOnFormsMenuAndLogInSubMenu(){
        elementsHelper.clickElement(formsMenu);
        logEvents(INFO_STEP, "Select Form Menu from the Home Page");
        actions.click(logInSubMenu).perform();
        logEvents(INFO_STEP, "Select LogIn SubMenu from Form Menu");
    }

    @Override
   public void isPageLoaded() {
    }
}
