package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {

	@Test(dependsOnMethods = "b", alwaysRun = true)
	public void a()
	{
		Reporter.log("a", true);
	}
	
	@Test
	public void b()
	{
		int i=9;
		int result=i/0;
		Reporter.log("b",true);
	}
	
	@Test(dependsOnMethods = "b")
	public void c()
	{
		Reporter.log("c", true);
	}
	
	@Test(dependsOnMethods = "b")
	public void d()
	{
		Reporter.log("d",true);
	}
}
