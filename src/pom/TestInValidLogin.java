package pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Flib;

public class TestInValidLogin  extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		BaseTest bt = new BaseTest();
		bt.setUP();
		
		Flib flib=new Flib();
		HomePage home=new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		int rc = flib.getRowCount("./data/TestData.xlsx", "InvalidCredentials");
		
		for (int i = 1; i <= rc; i++) {
			String invlidUsername = flib.readExcelFile("./data/TestData.xlsx", "InvalidCredentials", i, 0);
			String invlidPassword = flib.readExcelFile("./data/TestData.xlsx", "InvalidCredentials", i, 1);
			
			lp.invalidProcess(invlidUsername, invlidPassword);
		}
		
		bt.tearDown();
	}

}
