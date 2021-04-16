package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		Thread.sleep(2000);
		co.addArguments("--disable-notifications");
		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//td[@data-month='3']/descendant::a[.='3']")).click();
		

	}

}
