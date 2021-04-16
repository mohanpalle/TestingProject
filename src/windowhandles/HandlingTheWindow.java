package windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//closing all the browsers without using quit()
public class HandlingTheWindow {
	//we keep the parent browser alive and we kill the child browsers
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String parentTityle = driver.getTitle();
//		String parentwindow = driver.getWindowHandle();
//		System.out.println("address of parent window is "+parentwindow);
//		
		Set<String> windowhandle = driver.getWindowHandles();
		
		for(String wh:windowhandle)
		{
		
		 String title = driver.switchTo().window(wh).getTitle();
		 if (title.equalsIgnoreCase("HSBC")) {
			WebDriver window = driver.switchTo().window(wh);
			window.manage().window().maximize();
		}
		 else
		 {
			 driver.close();
		}
		 }
	}

}
