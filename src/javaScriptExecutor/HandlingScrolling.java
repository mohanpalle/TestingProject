package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		WebElement sponsors = driver.findElement(By.xpath("//h2[.='Platinum Level Sponsors']"));
		Point location = sponsors.getLocation();
		
		int xaxis = location.getX();
		int yaxis = location.getY();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");

	}

}
