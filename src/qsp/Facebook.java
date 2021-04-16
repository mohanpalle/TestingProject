package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("9985658514");
		driver.findElement(By.id("pass")).sendKeys("yxybs@1425");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
