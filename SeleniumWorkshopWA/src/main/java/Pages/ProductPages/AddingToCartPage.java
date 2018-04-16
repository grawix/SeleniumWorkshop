package Pages.ProductPages;

import Pages.BasePage;
import org.openqa.selenium.By;

public class AddingToCartPage extends BasePage {
    private final By closeWindowButton = By.cssSelector("span[title='Close window']");

    public ProductPage clickCloseAddingToCartWindow(){
        waitUntilElementAppear(closeWindowButton);
        clickOnElement(closeWindowButton);
        return new ProductPage();
    }
}
