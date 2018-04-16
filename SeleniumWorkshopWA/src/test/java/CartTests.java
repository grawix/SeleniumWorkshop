import Pages.ProductPages.ProductPage;
import org.junit.Assert;
import org.junit.Test;

public class CartTests extends BaseTest {

    @Test
    public void openFadeShortSleeveTShirtProductPage(){
        ProductPage productPage = mainPage.clickFadedShortSleeveTShirtProduct()
                .clickAddToCartButton()
                .clickCloseAddingToCartWindow()
                .moveMouseToCartButton();


        Assert.assertTrue("CheckOut button is not displayed but should.",
                productPage.isCheckOutButtonAppear());

        productPage.moveMouseToAddToCartButton();

        Assert.assertTrue("CheckOut button is displayed but should not.",
                productPage.isCheckOutButtonDisappear());
    }
}
