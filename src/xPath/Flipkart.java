package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/128/128/image/82b3ca5fb2301045.png?q=100']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Samsung') and @class='_3879cV']")).click();
		
		Thread.sleep(20000);
		driver.close();

	}

}
