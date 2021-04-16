package actions;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class MouseHoverCraftsvilla {
		
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();

				driver.get("https://www.craftsvilla.com/");
				Thread.sleep(3000);
				
				WebElement target = driver.findElement(By.xpath("//a[contains(.,'MEN')]"));
				Actions act = new Actions(driver);
				act.moveToElement(target).perform();
				driver.findElement(By.linkText("Jackets")).click();
		}
			

}
