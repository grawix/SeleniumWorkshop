import Pages.LoginPages.LoginPage;
import Pages.ProductPages.ProductPage;
import org.junit.Assert;
import org.junit.Test;

public class SmokeTest extends BaseTest{
    @Test
    public void openPageTest(){
        Assert.assertEquals("Wrong title for page after opening Main page",
                "My Store", mainPage.getTitle());
    }

    @Test
    public void openLoginPageTest(){
        LoginPage loginPage = mainPage.header.clickLoginButton();
        Assert.assertEquals("Wrong title for page after opening Login page",
                "Login - My Store", loginPage.getTitle());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void openFadeShortSleeveTShirtProductPage(){
        ProductPage productPage = mainPage.clickFadedShortSleeveTShirtProduct();
        Assert.assertEquals("Wrong title for page after opening Product page",
                "My Store", productPage.getTitle());
    }
}
