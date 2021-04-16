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
import org.testng.asserts.SoftAssert;


public class AssertionsInActiTime {

	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://desktop-2p1lg6m/login.do");
		
	}
	
	@Test
	public void login() throws InterruptedException
	{
		SoftAssert softassert = new SoftAssert();
		WebElement user = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		
		//critical features
		boolean statusOfUser = user.isDisplayed();
		Assert.assertEquals(statusOfUser, true);
		
		boolean statusOfPass = pass.isDisplayed();
		Assert.assertEquals(statusOfPass, true);
		
		boolean statusOfloginButton = loginBtn.isDisplayed();
		softassert.assertEquals(statusOfloginButton, true);
		
		//non critical feature
		String titleOfTheLoginPage = driver.getTitle();
		softassert.assertEquals(titleOfTheLoginPage, "actiTIME - Login");
		
		
		//actual login
		user.sendKeys("admin");
		pass.sendKeys("manager");
		loginBtn.click();
		Thread.sleep(3000);
		
		//non critical feature
		String titleOfTheHomePage = driver.getTitle();
		Assert.assertEquals(titleOfTheHomePage, "actiTIME - Enter Time-Track");
		
		Reporter.log("Create User", true);
		Reporter.log("Create Setting", true);
		
		//testable module if it some non critical features are not working
		softassert.assertAll();
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
