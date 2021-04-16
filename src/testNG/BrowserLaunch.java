package testNG;


	import org.apache.poi.hslf.record.Sound;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	import net.bytebuddy.asm.Advice.Local;

	public class BrowserLaunch {
		
		
		@Test
		public void googleLoginTest()
		
		{
			SoftAssert softAssert=new SoftAssert();
			System.out.println("launch Browser");
			System.out.println("Enter UserName");
			System.out.println("Enter Password");
			System.out.println("Click On the login");
			Assert.assertEquals(true, true);
			System.out.println("Validate Home Page ");
			softAssert.assertEquals(true, false,"not able to create report");
			System.out.println("Go to user");
			System.out.println("create the user");
			System.out.println("Go to reports");
			System.out.println("create the reports");
		    softAssert.assertAll();
		}
		
		@Test
		public void logout()
		{
			SoftAssert softAssert1=new SoftAssert();
			System.out.println("logout");
			softAssert1.assertEquals(true, false);
			softAssert1.assertAll();
		}

		
		
		@AfterClass
		public void tearDown()
		{ 
			SoftAssert softAssert2=new SoftAssert();
		
			softAssert2.assertAll();
		}


}
