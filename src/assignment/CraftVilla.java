package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CraftVilla {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.craftsvilla.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='searchval']")).sendKeys("Kurta");
		driver.findElement(By.xpath("//span[@class='input-group-btn']")).click();
		driver.findElement(By.xpath("(//div[@id='searchresults']/descendant::div[@class='product-img'])[1]")).click();
		driver.findElement(By.xpath("//ul[@class='pdp-color-size-container']/descendant::a[@id='size_L']")).click();
		driver.findElement(By.xpath("//span[.='Add to Cart']")).click();
		
	}

}
