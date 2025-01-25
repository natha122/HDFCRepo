package bankTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends LoginPage{

	
	@BeforeTest
	public void browserLaunch() {
		browserInitilisation("chrome");
	}
	
	@Test
	public void verifyTitleOfPage() {
		
		Assert.assertEquals("GTPL Bank Home Page", driver.getTitle());
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
