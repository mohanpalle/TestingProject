package pomAssignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keywordDrivenFramework.Flib;

public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;
	public void setUp() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Please enter correct browser value in property file");
		}
	}
	
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}

}
