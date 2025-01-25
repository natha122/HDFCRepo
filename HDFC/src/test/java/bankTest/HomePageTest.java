package bankTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends HomePage {
	
	@BeforeTest
	public void browserLaunch() {
		browserInitilisation("chrome");
	}
	
	@Test
	public void verifyTitleOfPage() {
		
		Assert.assertEquals("Gurru99 Bank Manager HomePage", driver.getTitle());
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
