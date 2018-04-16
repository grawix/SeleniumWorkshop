package Pages.Common;

import Pages.BasePage;
import Pages.LoginPages.LoginPage;
import org.openqa.selenium.By;

public class HeaderPage extends BasePage{

    private final By signInButtonLocator = By.className("login");

    public LoginPage clickLoginButton(){
        clickOnElement(signInButtonLocator);
        return new LoginPage();
    }
}
