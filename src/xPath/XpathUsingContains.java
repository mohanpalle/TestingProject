package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContains {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,'Username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();
		
		
		Thread.sleep(10000);
		driver.close();
	}

}
