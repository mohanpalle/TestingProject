package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("got")).click();
		
		driver.close();
	}
}
