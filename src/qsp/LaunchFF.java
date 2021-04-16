package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFF {
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodribver.exe");
	}
	
	public static void main(String[] args)
	{
		new LaunchFF();
	}

}
