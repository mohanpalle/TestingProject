package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
		driver.quit();

	}

}
