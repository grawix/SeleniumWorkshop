package Pages;

import Driver.Driver;
import Pages.Common.FooterPage;
import Pages.Common.HeaderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void clickOnElement(By locator) {
        findElement(locator).click();
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
