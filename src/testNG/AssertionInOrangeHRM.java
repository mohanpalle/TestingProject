package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionInOrangeHRM {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  Thread.sleep(2000);
	}

	@Test
	public void login() throws InterruptedException
	{
		SoftAssert softassert=new SoftAssert();
		WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		
		boolean statusOfUser = user.isDisplayed();
		Assert.assertEquals(statusOfUser, true);
		
		boolean statusOfPass = pass.isDisplayed();
		Assert.assertEquals(statusOfPass, true);
		
		boolean statusOfLogin = loginBtn.isDisplayed();
		Assert.assertEquals(statusOfLogin, true);
		
		
		String titleOfTheLoginPage = driver.getTitle();
		softassert.assertEquals(titleOfTheLoginPage, "OrangeHRM");
		
		
		//actual login
		user.sendKeys("Admin");
		pass.sendKeys("admin123");
		loginBtn.click();
		Thread.sleep(3000);
		
		//non critical feature
		String titleOfTheHomePage = driver.getTitle();
		softassert.assertEquals(titleOfTheHomePage, "OrangeHRM - HomePage");
		
		
		
		Reporter.log("Create User", true);
		Reporter.log("Created Setting", true);
		
		softassert.assertAll();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
}
