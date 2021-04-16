package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssign {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Core i5']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']")).click();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Operating System' and contains(@class,'_2gmUF')]")).click();
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[contains(.,'10')]")).click();
		
		String price = driver.findElement(By.xpath("//div[.='HP 14 Core i5 10th Gen - (8 GB/512 GB SSD/Windows 10 Home) 14-ck2018TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println("The Price of First Suggestion Laptop: "+price);
		Thread.sleep(30000);
		driver.close();
	}

}
