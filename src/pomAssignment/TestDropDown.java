package pomAssignment;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestDropDown extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "username");
		String pass = flib.readPropertyData(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.loginProcess(username, pass);
		
		WebDriverCommonLib wb = new WebDriverCommonLib();
		HomePage home = new HomePage(driver);
		home.getSetting().click();
		wb.waitForElement(30);
		WebElement dropdown1 = home.getDropDown1();
		WebElement dropdown2 = home.getDropDown2();
		home.getDropDownOptions(dropdown1);
		home.getDropDownOptions(dropdown2);
		
	}

}



