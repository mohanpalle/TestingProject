package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionTypes {

	@Test
	public void loginTest()
	{
		Reporter.log("Launch The Web App", true);
		Reporter.log("Verfiy the username text box", true);
		Assert.assertEquals(true, true);//Hard Assert
		
		Reporter.log("Verfiy the password text box", true);
		Reporter.log("Verify the login button", true);
		Reporter.log("Verify the loginPage title", true);
		Assert.assertEquals(false, true);//Hard Assert
		
		Reporter.log("Login to the app", true);
		Reporter.log("Verify the home page", true);
		Reporter.log("create user", true);
		Reporter.log("create setting", true);
		
	}
	
}
