package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {

	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyFile(PROP_PATH, "browser");
		
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.get("http://desktop-2p1lg6m/login.do");
			driver.manage().window().maximize();
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.get("http://desktop-2p1lg6m/login.do");
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Please correct browser name in property file");
		}
	}
	public void tearDown()
	{
		driver.close();
	}
}
