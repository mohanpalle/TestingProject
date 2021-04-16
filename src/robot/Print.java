package robot;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

		public class Print {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 FirefoxDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(2000);
			WebElement target = driver.findElement(By.xpath("//div[@class='YUhWwv']/a"));
			
			
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		/*
		 * Thread.sleep(3000); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
			
			for (int i = 1; i <=9; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(2000);
			}
			
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}


}



