package screenShotByTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot extends Base {

	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	@Test
	public void verifyTitle()
	{
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle, "Login-ActiTime");
	}
	
	@Test
	public void verifyTitle1()
	{
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle, "Login-ActiTime");
	}
	
	@Test
	public void verifyTitle2()
	{
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle, "Login-ActiTime");
	}
	
	@Test
	public void verifyTitle3()
	{
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle, "Login-ActiTime");
	}
	
	@Test
	public void verifyTitle4()
	{
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle, "Login-ActiTime");
	}
}
