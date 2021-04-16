package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		driver.findElementByName("username").sendKeys("abc@123");
		driver.findElementByName("password").sendKeys("abc@123");
		Thread.sleep(2000);
		
		driver.findElementByClassName("sqdOP  L3NKy   y3zKF     ").click();
	}

}
