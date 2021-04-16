package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	static WebDriver driver;

	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData("./data/config.properties", "browser");
		String url = flib.readPropertyData("./data/config.properties", "url");
		
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Please enter correct browser value in property file");
		}
		
		
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}
