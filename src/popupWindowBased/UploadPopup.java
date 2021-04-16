package popupWindowBased;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class UploadPopup {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);//wait for 4 sec
		driver.findElementById("txtUsername").sendKeys("Admin");//sent the username
		driver.findElementById("txtPassword").sendKeys("admin123");//sent the password
		
		Thread.sleep(2000);
		driver.findElementById("btnLogin").click();//click the login button
		driver.findElement(By.xpath("//a[.='My Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnAddAttachment")).click();
		Thread.sleep(10000);
		WebElement target = driver.findElement(By.id("ufile"));
//		Actions act = new Actions(driver);
		target.click();
//		act.doubleClick(target).perform();
		

}
	
}
