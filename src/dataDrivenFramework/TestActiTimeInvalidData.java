package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeInvalidData {
	
static{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://desktop-2p1lg6m/login.do");
	
	String path="./data/TestData.xlsx";
	String sheet="InvalidCredentials";
	Flib flib=new Flib();
	int rc = flib.getRowCount(path, sheet);
	
	for (int i =1; i <= rc; i++) {
		String username = flib.readExcelFile(path, sheet, i, 0);
		String pass=flib.readExcelFile(path, sheet, i, 1);
		WebElement user = driver.findElement(By.name("username"));
		user.clear();
		user.sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	}
	
	}
}
