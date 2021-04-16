package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActiTime extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib=new Flib();
		String us = flib.readPropertyData("./data/config.properties", "username");
		String pass = flib.readPropertyData("./data/config.properties", "password");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(us);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
