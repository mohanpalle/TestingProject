package popup;


		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;


		public class AlertPopup {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/HP/OneDrive/Desktop/alert.html");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[.='Try it']")).click();
				Thread.sleep(2000);
				
				Alert al = driver.switchTo().alert();
				
				al.dismiss();
		/*
		 * String textOfThePopup = al.getText(); System.out.println(textOfThePopup);//
		 * NoAlertPresentException
		 */
				
			}

}
