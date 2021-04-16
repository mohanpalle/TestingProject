package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
	
	@Test()
	public void login()
	{
		Reporter.log("Login");		
	}
	
	@Test(dependsOnMethods = "login")
	public void createUser()
	{
		Reporter.log("User Created");
	}
	
	@Test(dependsOnMethods = "createUser")
	public void logout()
	{
		Reporter.log("Logout");
	}
}
