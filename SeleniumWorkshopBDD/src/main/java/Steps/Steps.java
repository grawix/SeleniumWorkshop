package Steps;

import Pages.BasePage;
import Pages.CategoryPages.DressesCategoryPage;
import Pages.CategoryPages.TShirtCategoryPage;
import Pages.CategoryPages.WomenCategoryPage;
import Pages.LoginPages.LoginPage;
import Pages.MainPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Steps {

    private Map<String, Object> scenarioContext;

    public Steps(){
        scenarioContext = new HashMap<>();
    }

    @Given("^I open Main Page$")
    public void mainPageOpen() {
        MainPage mainPage = Driver.Driver.loadMainPage();
        scenarioContext.put("MainPage",mainPage);
    }

    @When("^I click on Sign In button$")
    public void clickSignIn() {
        MainPage mainPage = (MainPage) scenarioContext.get("MainPage");
        LoginPage loginPage = mainPage.header.clickLoginButton();
        scenarioContext.put("LoginPage", loginPage);
    }

    @When("^I click on '(.*?)' button$")
    public void clickButton(String buttonName) {
        MainPage mainPage = (MainPage) scenarioContext.get("MainPage");
        switch(buttonName) {
            case "Women":
                WomenCategoryPage womenCategoryPage = mainPage.clickWomenCategoryButton();
                scenarioContext.put("WomenCategoryPage", womenCategoryPage);
                break;
            case "Dresses":
                DressesCategoryPage dressesCategoryPage = mainPage.clickDressesCategoryButton();
                scenarioContext.put("DressesCategoryPage", dressesCategoryPage);
                break;
            case "T-shirts":
                TShirtCategoryPage tShirtCategoryPage = mainPage.clicTShirtCategoryButton();
                scenarioContext.put("TShirtCategoryPage", tShirtCategoryPage);
                break;
        }
    }

    @Then("^Open page with title '(.*?)'$")
    public void mainPageOpen(String title) {
        BasePage basePage = (BasePage) scenarioContext.get("MainPage");
        Assert.assertEquals(title, basePage.getTitle());
    }

    @After
    public void after() {
        Driver.Driver.quit();
    }
}
