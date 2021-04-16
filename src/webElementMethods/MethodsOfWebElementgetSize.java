package webElementMethods;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MethodsOfWebElementgetSize {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.get("https://www.google.com/");
			WebElement googleSearchBox = driver.findElement(By.name("q"));
			Dimension size = googleSearchBox.getSize();
			int height = size.getHeight();
			int width = size.getWidth();
			System.out.println("The height of the googleSearchBox is "+height+ "  The width is "+ width);
		}

}