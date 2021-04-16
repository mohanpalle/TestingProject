package xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
		
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[.='✕']")).click();
			driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l 1sbqEe 3AWRsL']")).click();
			
		}


}
