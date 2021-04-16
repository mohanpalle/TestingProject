package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 0)
	public void x()
	{
		Reporter.log("Hi i am x method", true);
	}
	
	@Test
	public void g()
	{
		Reporter.log("Hi i am g method", true);
	}
	
	 @Test(priority = 2 )
	public void a()
	{
		Reporter.log("Hi i am a method", true);
	}
	 
	 @Test(priority = 2)
	 public void h()
	 {
		 Reporter.log("Hi i am h method", true); 
	 }
	 
	 @Test(priority = 1)
	 public void p()
	 {
		 Reporter.log("Hi i am p method", true);
	 }
	 
	 @Test(priority = 3)
	 public void e()
	 {
		 Reporter.log("Hi i am e method", true);
	 }
}
