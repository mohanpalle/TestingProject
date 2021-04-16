package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
//		
//		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("sjddhb@13");
//		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("abc@1234");
//		
//		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//		
//		driver.findElement(By.linkText("Request OTP")).click();
		
		WebElement text = driver.findElement(By.cssSelector("span[class='_36KMOx']"));
		
		System.out.println(text);
		//driver.findElement(By.partialLinkText("New")).click();
		
		Thread.sleep(20000);
		driver.close();
		
	}

}
