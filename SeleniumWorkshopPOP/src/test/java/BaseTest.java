import Pages.MainPage;
import org.junit.After;
import org.junit.Before;
import Driver.Driver;

public class BaseTest {

    MainPage mainPage;

    @Before
    public void prepareSingleTest() {
        mainPage = Driver.loadMainPage();
    }

    @After
    public void closingSingleTest() {
        Driver.quit();
    }
}
