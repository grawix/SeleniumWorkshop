package Pages;

import Pages.ProductPages.ProductPage;
import org.openqa.selenium.By;

public class MainPage extends BaseContentPage{

    private final By fadedShortSleeveTShirtProductLocator = By.cssSelector("ul#homefeatured div.right-block a[title='Faded Short Sleeve T-shirts']");

    public ProductPage clickFadedShortSleeveTShirtProduct(){
        clickOnElement(fadedShortSleeveTShirtProductLocator);
        return new ProductPage();
    }
}