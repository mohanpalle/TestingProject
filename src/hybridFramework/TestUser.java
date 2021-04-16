package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestUser extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		String user = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "password");
		lp.loginProcess(user, password);
		
		WebDriverCommonLib wb = new WebDriverCommonLib();
		wb.waitForElement(driver);
		HomePage home = new HomePage(driver);
		
		home.createUser("voddlkk@123", "abc@123", "abc@123", "abhi", "Addd", "9658741230", "abc2@gmail.com");
		Thread.sleep(5000);
		wb.refreshPage();
		/*
		 * WebElement a = driver.findElement(By.xpath("//a[contains(text(),'mbpalle123')]"));
		 * home.verifyUserCreate(driver, 30, a, "mbpalle123");
		 */
		 
		home.deleteUser(driver);
	}

}
