package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchBrowser_BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	@Parameters("browser")

	public void browsersetup(String browser) {

		String Projectdire = System.getProperty("user.dir");
		System.out.println("Project path is = : " + Projectdire);

		if (browser.equalsIgnoreCase("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver", Projectdire + "/Driver/chromedriver.exe");
			driver = new ChromeDriver();


		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", Projectdire + "/Driver/geckodriver.exe");
			driver = new FirefoxDriver();
	
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", Projectdire + "/Driver/msedgedriver.exe");
			driver = new EdgeDriver();

		}
		else 
		{
			throw new IllegalArgumentException("Browser not supported : " + browser);
			
		}
		
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
