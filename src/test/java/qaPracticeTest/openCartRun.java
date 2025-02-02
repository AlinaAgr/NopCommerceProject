package qaPracticeTest;

import qaPracticePages.*;
import org.testng.annotations.Test;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class openCartRun extends BaseTest{

    @Test
    public void ProiectFinalTest() {
        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        RegisterFormPage registerFormPage = new RegisterFormPage(driver);
        registerFormPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        registerFormPage.registerFormPageActions();
        logEvents(INFO_STEP, "Filling the form from Register Page");
        LogInPage logInPage = new LogInPage(driver);
        logInPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        homePage.clickOnFormsMenuAndLogInSubMenu();
        logEvents(PASS_STEP, "Select Form Menu and after select LogIn SubMenu");
        logInPage.logInForm();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        shoppingCartPage.addingProductsInTheCart();
        logEvents(INFO_STEP, "Adding items in the cart and continue to the CheckOut Page");
        ShippingDetailsPage shippingDetailsPage = new ShippingDetailsPage(driver);
        shippingDetailsPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        shippingDetailsPage.fillCheckOutForm();
        logEvents(INFO_STEP, "Filling the form from the CheckOut Page");
        homePage.goBackToHomePage();
        logEvents(PASS_STEP, "Going back to the Home Page");
    }
}
