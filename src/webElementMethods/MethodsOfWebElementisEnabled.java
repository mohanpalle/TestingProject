package webElementMethods;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.Rectangle;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MethodsOfWebElementisEnabled {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.get("https://www.google.com/");
			WebElement buttonSignin = driver.findElement(By.linkText("Sign in"));
		    boolean result = buttonSignin.isEnabled();
		    System.out.println(result);


		}

}
