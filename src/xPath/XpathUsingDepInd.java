package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDepInd {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Pen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		
		String price = driver.findElement(By.xpath("(//span[.='Reynolds Racer Gel Sporty Gel Pen | Needle Point (0.5mm) | Blue Ink | 20 Count']/ancestor::div[@class='a-section a-spacing-medium']/descendant::span[@class='a-price'])[1]")).getText();
		System.out.println(price);
	}
}
