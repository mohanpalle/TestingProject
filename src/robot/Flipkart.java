package robot;

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Flipkart {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(2000);
			WebElement target = driver.findElement(By.xpath("//div[@class='YUhWwv']/a"));
			Actions act = new Actions(driver);
			act.contextClick(target).perform();
			
			Robot robot = new Robot();
			for (int i = 1; i <=6; i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
			}
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}


}
