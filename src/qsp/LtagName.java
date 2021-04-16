package qsp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LtagName {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement input = driver.findElementById("input");
		input.sendKeys("QSpider");
		Thread.sleep(2000);
		driver.close();
	}

}
