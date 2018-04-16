package Pages;

import Pages.CategoryPages.DressesCategoryPage;
import Pages.CategoryPages.TShirtCategoryPage;
import Pages.CategoryPages.WomenCategoryPage;
import Pages.ProductPages.ProductPage;
import org.openqa.selenium.By;

public class MainPage extends BaseContentPage{

    private final By fadedShortSleeveTShirtProductLocator = By.cssSelector("ul#homefeatured div.right-block a[title='Faded Short Sleeve T-shirts']");
    private final By womanButtonLocator = By.xpath("//a[text()='Women']");
    private final By dressesButtonLocator = By.xpath("//ul[contains(@class,'menu-content')]/li/a[text()='Dresses']");
    private final By tShirtButtonLocator = By.xpath("//ul[contains(@class,'menu-content')]/li/a[text()='T-shirts']");

    public ProductPage clickFadedShortSleeveTShirtProduct(){
        clickOnElement(fadedShortSleeveTShirtProductLocator);
        return new ProductPage();
    }

    public WomenCategoryPage clickWomenCategoryButton(){
        clickOnElement(womanButtonLocator);
        return new WomenCategoryPage();
    }

    public TShirtCategoryPage clicTShirtCategoryButton(){
        clickOnElement(tShirtButtonLocator);
        return new TShirtCategoryPage();
    }

    public DressesCategoryPage clickDressesCategoryButton(){
        clickOnElement(dressesButtonLocator);
        return new DressesCategoryPage();
    }
}
