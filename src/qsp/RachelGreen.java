package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RachelGreen {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElementByName("q").sendKeys("Rachel Green",Keys.ENTER);	
		Thread.sleep(2000);
		
		driver.findElementByTagName("canvas").click();
	}

}
