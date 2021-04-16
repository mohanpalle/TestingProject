package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("session[username_or_email]")).sendKeys("9985658514");
		driver.findElement(By.className("css-1dbjc4n r-16y2uox r-1wbh5a2")).sendKeys("yxybs@1425");
		Thread.sleep(5000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
