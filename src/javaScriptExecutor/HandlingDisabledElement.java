package javaScriptExecutor;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HandlingDisabledElement {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/HP/OneDrive/Desktop/DisabledElement.html");
			WebElement usn = driver.findElement(By.id("i1"));
			WebElement psw = driver.findElement(By.id("i2"));
			
			if(usn.isEnabled())
			{
				usn.sendKeys("Admin");
			}
			else
			 
			{
				js.executeScript("document.getElementById(\"i1\").value=\"Admin\"");	
			}
			Thread.sleep(2000);
			
			if(psw.isEnabled())
			{
				psw.sendKeys("Manager");
			}
			else
			{
				js.executeScript("document.getElementById(\"i2\").value=\"manager\"");	
			}
						
		}


}
