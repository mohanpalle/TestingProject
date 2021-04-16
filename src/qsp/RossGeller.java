package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RossGeller {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElementByName("q").sendKeys("Ross Geller",Keys.ENTER);	
		Thread.sleep(2000);
		
		driver.findElementByTagName("canvas").click();
	}

}
