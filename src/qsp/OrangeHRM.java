package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);//wait for 4 sec
		driver.findElementById("txtUsername").sendKeys("Admin");//sent the username
		driver.findElementById("txtPassword").sendKeys("admin123");//sent the password
		
		Thread.sleep(2000);
		driver.findElementById("btnLogin").click();//click the login button
}
}
