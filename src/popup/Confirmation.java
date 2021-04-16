package popup;

import popup.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Confirmation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/confirmation.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		String textOfPopup = al.getText();
		System.out.println(textOfPopup);
		
		al.dismiss();// dismiss the popup
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(2000);
		
		Alert al2 = driver.switchTo().alert();
		String textOfPopup2 = al2.getText();
		System.out.println(textOfPopup2);
		
		al2.accept();// accept the popup
		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
		String text1 = text.getText();
		System.out.println(text1);
	}

}
