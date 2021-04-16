package xPath;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ActiTimeValidationUsingExpliciWait {
		public static void main(String[] args) {
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://desktop-2p1lg6m/login.do");
		String loginActualTitle = driver.getTitle();
		WebDriverWait wb=new WebDriverWait(driver, 30);
		wb.until(ExpectedConditions.titleContains("actiTIME - Login"));
		System.out.println("Login page is displayed ---->Test Case is passed");
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	    String homePageActualTitle = driver.getTitle();
	    wb.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
	    System.out.println("Home page is displayed ----> Test Case is passed");
	   
		
	
	}


}
