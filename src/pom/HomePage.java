package pom;

import org.apache.poi.ss.formula.functions.Vlookup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[@href='/reports/reports.do']") private WebElement report;
	@FindBy(xpath = "//a[@href='/administration/administration.do']") private WebElement setting;
	@FindBy(xpath = "//a[@href='/administration/userlist.do']") private WebElement users;
	@FindBy(xpath = "//input[@value='Create New User']") private WebDriver crtUser;

	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getReport() {
		return report;
	}


	public WebElement getSetting() {
		return setting;
	}


	public WebElement getUsers() {
		return users;
	}

	public void setting()
	{
		setting.click();
	}
	
	public WebDriver getcrtUser() {
		return crtUser;
	}
	public void users()
	{
		users.click();
	}

}
