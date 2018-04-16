package Pages;

import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public boolean waitUntilElementAppear(By by){
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        try{
            element = wait.until(ExpectedConditions.visibilityOf(findElement(by)));
        }
        catch(Exception e){
            return false;
        }
        return element.isDisplayed();
    }

    public boolean waitUntilElementDisappear(By by){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.invisibilityOf(findElement(by)));
    }
}
