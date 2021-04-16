package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestActiTime {

	WebDriver driver;
	@Parameters({"browser", "usn", "pwd"})
	@Test()
	public void launchBrowser(String browserValue, String username, String pass)
	{
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://desktop-2p1lg6m/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement user = driver.findElement(By.name("username"));
			user.clear();
			user.sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://desktop-2p1lg6m/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement user = driver.findElement(By.name("username"));
			user.clear();
			user.sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			
		}
	}
}
