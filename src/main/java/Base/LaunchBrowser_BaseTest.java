package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser_BaseTest {

	protected WebDriver driver;

	@BeforeMethod

	public void browsersetup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/admin");
		driver.navigate().refresh();
	}

	@AfterMethod

	public void teardown() {

		if (driver != null) {
			driver.quit();
		}
	}

}
