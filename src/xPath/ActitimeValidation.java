package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeValidation {

		public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://desktop-2p1lg6m/login.do");
		String loginActualTitle = driver.getTitle();
		if(loginActualTitle.equals("actiTIME - Login"))
		{
		System.out.println("Login Page is displayed ----> TEST CASE IS PASSED");	
		}
		else
		{
			System.out.println("Login Page is not displayed ----> TEST CASE IS FAILED");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	    String homePageActualTitle = driver.getTitle();
	    System.err.println(homePageActualTitle);
	    if(homePageActualTitle.equals("actiTIME - Enter Time-Track"))
	    {
	    	System.out.println("Home Page is displayed ----> TEST CASE IS PASSED");		
	    }
	    else
	    {
	    	System.out.println("Home Page is not displayed ----> TEST CASE IS FAILED");
	    }
			
	}
}
