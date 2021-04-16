package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

@Test
public class DataProviderClass {
	
	WebDriver driver;
	
  @BeforeMethod
  public void setUP() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://desktop-2p1lg6m/login.do");
	
  }
  
  @DataProvider(name = "TestData")
  
  public Object[][] testData()
  {
	  Object[][] data = new Object[3][2];
	  
	  data[0][0]="admin123";
	  data[0][1]="manager123";
	  
	  data[1][0]="admin@#$123";
	  data[1][1]="admin%$#123";
	  
	  data[2][0]="admieeden@#$123";
	  data[2][1]="admidswn%$#123";
	  
	  
	  return data;
  }
  

  @AfterMethod
  public void tearDown() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

  @Test(dataProvider = "TestData")
  public void loginMethodForInvalidCredentials(String usn, String psw) throws InterruptedException {
	  
	  	driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(psw);
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
  }

  

}
