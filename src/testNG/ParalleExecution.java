package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParalleExecution {
	
	@Test
	public void method1()
	{
		Reporter.log("Hi I am from method1 i am running on port: "+Thread.currentThread().getId(), true);
	}
	
	@Test
	public void method2()
	{
		Reporter.log("Hi I am from method2 i am running on port: "+Thread.currentThread().getId(), true);
	}

}
