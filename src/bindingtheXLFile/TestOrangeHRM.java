package bindingtheXLFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);//wait for 4 sec
		
		Flib fs = new Flib();
		String user = fs.readExcel("./data/TestData.xlsx", "ValidCredentials", 1, 0);
		String pass = fs.readExcel("./data/TestData.xlsx", "ValidCredentials", 1, 1);
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

}
