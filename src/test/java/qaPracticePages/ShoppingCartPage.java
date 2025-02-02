package qaPracticePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.*;

public class ShoppingCartPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button")
    private WebElement addFirstItem;

    @FindBy (xpath = "//*[@id=\"prooood\"]/section[2]/div/div[4]/div/button")
    private WebElement addSecondItem;

    @FindBy (xpath = "//*[@id=\"prooood\"]/section[2]/div/div[5]/div/button")
    private WebElement addThirdItem;

    @FindBy (xpath = "//*[@id=\"prooood\"]/section[1]/div[2]/div[1]/div[2]/input")
    private WebElement changeQuantity;

    @FindBy (xpath = "//*[@id=\"prooood\"]/section[1]/div[2]/div[2]/div[2]/button")
    private WebElement removeAnItem;

    @FindBy (xpath = "//*[@id=\"prooood\"]/section[1]/button")
    private WebElement checkOutButton;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void addingProductsInTheCart(){
        addingTheFirstItem();
        addingTheSecondtItem();
        addingTheThirdtItem();
        goToCheckOutPage();
        logEvents(INFO_STEP, "Add and modify the items from the cart");
    }

    public void addingTheFirstItem(){
        actions.scrollToElement(addFirstItem).perform();
        elementsHelper.clickElement(addFirstItem);
        elementsHelper.fillElement(changeQuantity, "10");
    }

    public void addingTheSecondtItem(){
       actions.scrollToElement(addSecondItem).perform();
       elementsHelper.clickElement(addSecondItem);
       elementsHelper.clickElement(removeAnItem);
    }

    public void addingTheThirdtItem(){
        actions.scrollToElement(addThirdItem).perform();
        elementsHelper.clickElement(addThirdItem);
    }

    public void goToCheckOutPage(){
        actions.scrollToElement(checkOutButton).click(checkOutButton).perform();
    }

    @Override
   public void isPageLoaded() {

    }
}
