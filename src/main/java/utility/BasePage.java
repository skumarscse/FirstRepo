package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	public String browser = "chrome";

	public BasePage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\chromedriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}
	public boolean isElementVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}

