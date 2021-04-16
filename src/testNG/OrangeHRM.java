package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class OrangeHRM {
	    WebDriver driver;
	    
		@Test
		@Parameters({"username","password"})
		public void orangeHRMLogin(String validUsername,String validPassword)
		{
		SoftAssert softAssert = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement username = driver.findElement(By.id("txtUsername"));
	
		Assert.assertEquals(username.isDisplayed(),true);
		username.sendKeys(validUsername);;
		
		driver.findElement(By.id("txtPassword")).sendKeys(validPassword);
		driver.findElement(By.id("btnLogin")).click();
		
		softAssert.assertNotEquals(driver.getTitle(), "OrangeHRM");
		
		
		System.out.println("Added the employee");
		
		System.out.println("verified the added employee");
		softAssert.assertAll();
		
		
		
		
		
	}

}
