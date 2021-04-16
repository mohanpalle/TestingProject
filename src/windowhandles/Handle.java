package windowhandles;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String parentwindow = driver.getWindowHandle();
		System.out.println("address of parent window is "+parentwindow);
		
		Set<String> alllwindows = driver.getWindowHandles();
		
		for(String se:alllwindows)
		{
			System.out.println(se);
		}
		
	}

}
