package dropdown;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class HandlingTheDropdowndeselectByVisibletext {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.get("file:///C:/Users/HP/OneDrive/Desktop/MultipleSelect.html");
			
			WebElement dropdown = driver.findElement(By.id("Menu"));
			Select sel = new Select(dropdown);
			Thread.sleep(4000);
			
			
			sel.selectByVisibleText("Pavbhaji");
			Thread.sleep(4000);
			sel.deselectByVisibleText("Pavbhaji");
			
			
			
			


	}
}