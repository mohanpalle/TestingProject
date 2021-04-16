package popupWindowBased;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Downloads'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\OneDrive\\Desktop\\WCSM\\Automation\\popup\\download.exe");
		

	}

}
