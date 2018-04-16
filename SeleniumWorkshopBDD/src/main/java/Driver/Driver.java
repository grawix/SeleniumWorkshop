package Driver;

import Pages.MainPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (null == driver) {
			if (true) {
				final String SELENIUM_GRID_URL = "http://192.168.56.102:4444/wd/hub";
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities.setBrowserName("chrome");
				try {
					driver = new RemoteWebDriver(new URL(SELENIUM_GRID_URL), capabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				driver.manage().window().setSize(new Dimension(1920, 1200));
			} else {
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
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
