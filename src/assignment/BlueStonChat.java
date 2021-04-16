package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueStonChat {
		
		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com/");
			Thread.sleep(5000);
			WebElement chat = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
			driver.switchTo().frame(chat);
			driver.findElement(By.xpath("//div[@class='lc-1z06j5z e1dmt1bi1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mohan");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd132@gmail.com");
			driver.findElement(By.xpath("//input[@id='yu2p0ekbb1_3']")).sendKeys("9856745852");
			driver.findElement(By.xpath("//input[@id='wcc8s2b0xpk_4']")).sendKeys("Ring");
			driver.findElement(By.xpath("//textarea[@id='ir6radroz0t_5']")).sendKeys("Price of the Rings");
			driver.findElement(By.xpath("//span[.='Leave a message']")).click();
			
			
			
		 
			
		}

}
