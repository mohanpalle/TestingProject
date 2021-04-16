package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneRing {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//nav[@class='wh-navbar']/descendant::ul[@class='wh-main-menu']/descendant::a[.='Rings ']")).click();;
		driver.findElement(By.xpath("(//div[@id='search-result']//descendant::img[@class='hc img-responsive center-block'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='find-nearest-store']")).clear();
		driver.findElement(By.xpath("//a[@id='ringSizeHelpText']")).click();
		
	}

}
