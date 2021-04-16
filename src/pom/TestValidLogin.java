package pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import keywordDrivenFramework.Flib;

public class TestValidLogin  extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		BaseTest bt = new BaseTest();
		bt.setUP();
		
		Flib flib=new Flib();
		WebDriverCommonLib wb = new WebDriverCommonLib();
		HomePage home=new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		String us = flib.readPropertyData(PROP_PATH, "username");
		String pass = flib.readPropertyData(PROP_PATH, "password");
		
		String actualTitle=wb.getTitle();
		wb.verifyTitleOfTheWebPage(actualTitle, "actiTIME - Login", "login");
	
		lp.loginProcess(us, pass);
		wb.waitForElement(2);
		/*
		 * String actualTitle1=wb.getTitle();
		 *  wb.verifyTitleOfTheWebPage(actualTitle1, "actiTIME - Enter Time-Track", "home");
		 */
		
		wb.waitForPageLoad(20, "Enter");
		String homeTitle = wb.getTitle();
		wb.verifyTitleOfTheWebPage(homeTitle, "actiTIME - Enter Time-Track", "home");
		
	
	}

}


