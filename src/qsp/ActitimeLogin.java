package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-2p1lg6m/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='content users_selected selected']")).click();
//		driver.findElement(By.xpath("//a[.='Open Tasks']")).click();
//		driver.findElement(By.xpath("//td//input[@value='Create New Tasks']")).click();
		
		Thread.sleep(20000);
		driver.close();
	}

}
