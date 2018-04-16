package Driver;

import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (null == driver) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static MainPage loadMainPage() {
		getDriver();
		driver.get("http://automationpractice.com/");
		return new MainPage();
	}

	public static void quit() {
		if(null != driver) {
			driver.quit();
		}
		driver = null;
	}
}
