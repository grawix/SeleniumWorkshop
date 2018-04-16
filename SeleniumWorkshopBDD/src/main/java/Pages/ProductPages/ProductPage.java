package Pages.ProductPages;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ProductPage extends BasePage{

    private final By addToCartButtonLocator = By.name("Submit");
    private final By viewCartButtonLocator = By.cssSelector("a[title='View my shopping cart']");
    private final By checkOutButtonLocator = By.id("button_order_cart");

    public AddingToCartPage clickAddToCartButton(){
        waitUntilElementAppear(addToCartButtonLocator);
        clickOnElement(addToCartButtonLocator);
        return new AddingToCartPage();
    }

    public ProductPage moveMouseToAddToCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(findElement(addToCartButtonLocator)).build().perform();
        return new ProductPage();
    }

    public ProductPage moveMouseToCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(findElement(viewCartButtonLocator)).build().perform();
        return new ProductPage();
    }

    public boolean isCheckOutButtonAppear(){
        return waitUntilElementAppear(checkOutButtonLocator);
    }

    public boolean isCheckOutButtonDisappear(){
        return waitUntilElementDisappear(checkOutButtonLocator);
    }
}
