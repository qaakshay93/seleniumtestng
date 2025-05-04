package Pages_elementslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nopcommerce_loginpage {

	protected WebDriver driver;
	
//   Declared webelement by class in selenium 

	private By usenamebox = By.id("Email");
	private By Userpassword = By.id("Password");
	private By loginbutton = By.xpath("//button[@type='submit']");

// constructor we created for cast the driver with this page webdriver directly //

	public nopcommerce_loginpage(WebDriver driver) {

		this.driver = driver;

	}

	public void noncomwebelement(String username, String password) {

		driver.findElement(usenamebox).clear();
		driver.findElement(usenamebox).sendKeys(username);

		driver.findElement(Userpassword).clear();
		driver.findElement(Userpassword).sendKeys(password);

		

	}
	public void noncombutton() {
		driver.findElement(loginbutton).click(); 
	}
}
