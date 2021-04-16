package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {

	//Grouping Methods
	
	@Test(groups = "Intergration")
	public void it1()
	{
		Reporter.log("Executed IT1");
	}
	
	@Test(groups = "Functional")
	public void ft1()
	{
		Reporter.log("Executed FT1");
	}
	
	@Test(groups = "Smoke")
	public void st1()
	{
		Reporter.log("Executed ST1");
	}
	
	@Test(groups = "Intergration")
	public void it2()
	{
		Reporter.log("Executed IT2");
	}
	
	@Test(groups = "Functional")
	public void ft2()
	{
		Reporter.log("Executed FT2");
	}
	
	@Test(groups = "Smoke")
	public void st2()
	{
		Reporter.log("Executed ST2",true);
	}
	
	@Test(groups = "Intergration")
	public void it3()
	{
		Reporter.log("Executed IT3",true);
	}
	
	@Test(groups = "Functional")
	public void ft3()
	{
		Reporter.log("Executed FT3",true);
	}
	
	@Test(groups = "Smoke")
	public void st3()
	{
		Reporter.log("Executed ST3",true);
	}
	
	@Test(groups = "Intergration")
	public void it4()
	{
		Reporter.log("Executed IT4",true);
	}
	
	@Test(groups = "Functional")
	public void ft4()
	{
		Reporter.log("Executed FT4",true);
	}
	
	@Test(groups = "Smoke")
	public void st4()
	{
		Reporter.log("Executed ST4",true);
	}
	
	@Test(groups = "Intergration")
	public void it5()
	{
		Reporter.log("Executed IT5",true);
	}
	
	@Test(groups = "Functional")
	public void ft5()
	{
		Reporter.log("Executed FT5",true);
	}
	
	@Test(groups = "Smoke")
	public void st5()
	{
		Reporter.log("Executed ST5",true);
	}
	
	@Test(groups = "Intergration")
	public void it6()
	{
		Reporter.log("Executed IT6",true);
	}
	
	@Test(groups = "Functional")
	public void ft6()
	{
		Reporter.log("Executed FT6",true);
	}
	
	@Test(groups = "Smoke")
	public void st6()
	{
		Reporter.log("Executed ST6",true);
	}
	
	
}
