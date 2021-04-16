package keywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeUsingProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Flib flib=new Flib();
		//String browser = flib.readPropertyData("./data/config.properties", "browser");
		String url = flib.readPropertyData("./data/config.properties", "url");
		String webdriver = flib.readPropertyData("./data/config.properties", "browserkey");
		String browser = flib.readPropertyData("./data/config.properties", "browservalue");
		String username = flib.readPropertyData("./data/config.properties", "username");
		String password = flib.readPropertyData("./data/config.properties", "password");
		
		System.setProperty(webdriver, browser);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		

	}

}
