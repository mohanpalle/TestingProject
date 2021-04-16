package screenshots;


	import java.io.File;
	import java.io.IOException;
import java.rmi.Remote;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

	public class Flipkart {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			//DOWNCASTING
			RemoteWebDriver rwd=(RemoteWebDriver)driver;
			
			File src=rwd.getScreenshotAs(OutputType.FILE);
			File des=new File("./screenshots/flipkart.png");
		
			Files.copy(src, des);
			
		}

}
