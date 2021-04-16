package javaScriptExecutor;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HandlingTheDisabledElement {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/HP/OneDrive/Desktop/DisabledElement.html");
			driver.findElement(By.id("i1")).sendKeys("Admin");
			
		
			js.executeScript("document.getElementById(\"i2\").value=\"manager\"");
			
			
			
			
		}

}
