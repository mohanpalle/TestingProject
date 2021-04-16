package screenShotByTestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	static WebDriver driver;

	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://desktop-2p1lg6m/login.do");
	}

	public void fail(String fileName)
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File scr=ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots/"+fileName+".png");
			Files.copy(scr, dest);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		
	}
}
