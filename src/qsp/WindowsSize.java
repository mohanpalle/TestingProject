package qsp;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsSize {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		
		Dimension d = new Dimension(200, 100);
		driver.manage().window().setSize(d);
		
		org.openqa.selenium.Point p = new org.openqa.selenium.Point(200, 300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
