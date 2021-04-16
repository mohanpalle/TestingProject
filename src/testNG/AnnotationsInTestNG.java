package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {

	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before Class", true);
	}
	
	
	@BeforeMethod 
	public void beforeMethod()
	{
		Reporter.log("Before Method", true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before Test", true);
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Before Suite", true);
	}
	
	@Test
	public void test()
	{
		Reporter.log("Test Script", true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After Suite", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After Class", true);
	}
	
	@AfterMethod 
	public void afterMethod()
	{
		Reporter.log("After Method", true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After Test", true);
	}
}
