package Testes;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.LaunchBrowser_BaseTest;
import Pages_elementslocator.nopcommerce_loginpage;


public class Nopecommersoginpagetest extends LaunchBrowser_BaseTest {

	@Test
	
	public void testvalidlogin() throws InterruptedException {

		nopcommerce_loginpage loginnopcom = new nopcommerce_loginpage(driver);
		
		loginnopcom.noncomwebelement("admin@yourstore.com", "admin");
		loginnopcom.noncombutton();
		
		Thread.sleep(8000);
		
		System.out.println("title of the page is -" + driver.getTitle());
//		driver.getTitle();
		String Actualtitle = driver.getTitle();
		String expectedtitle = "Just a moment...";
		
		Assert.assertEquals(Actualtitle, expectedtitle);

		
	
	}

}
