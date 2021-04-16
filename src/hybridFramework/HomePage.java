package hybridFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath = "//a[@class='content tt_selected selected']") private WebElement timeTrack;
	@FindBy(xpath = "//a[@class='content tasks_selected selected']") private WebElement reports;
	@FindBy(xpath = "//a[@class='content users']") private WebElement users;
	@FindBy(xpath = "//a[@class='content calendar']") private WebElement wSchedule;
	@FindBy(xpath = "//a[@class='content administration']") private WebElement setting;
	
	//user Task
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement crtUser;
	@FindBy(xpath = "//input[@name=\"username\"]") private WebElement username;
	@FindBy(xpath = "//input[@name=\"passwordText\"]") private WebElement password;
	@FindBy(xpath = "//input[@name=\"passwordTextRetype\"]") private WebElement retypePass;
	@FindBy(xpath = "//input[@name=\"firstName\"]") private WebElement fName;
	@FindBy(xpath = "//input[@name=\"lastName\"]") private WebElement lName;
	@FindBy(xpath = "//input[@name=\"mobile\"]") private WebElement mobile;
	@FindBy(xpath = "//input[@name=\"email\"]") private WebElement eMail;
	@FindBy(xpath = "//input[@value='   Create User   ']") private WebElement userSubmit;
	@FindBy(xpath = "(//td[@class='listtblcell']//a)[1]") private WebElement userList;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteUser;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeTrack() {
		return timeTrack;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getwSchedule() {
		return wSchedule;
	}

	public WebElement getSetting() {
		return setting;
	}
	
	public WebElement getcrtUser()
	{
		return crtUser;
	}
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRetypePass() {
		return retypePass;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getUserSubmit() {
		return userSubmit;
	}
	
	

	public WebElement getUserList() {
		return userList;
	}
	
	

	public WebElement getDeleteUser() {
		return deleteUser;
	}

	public void createUser(String userName, String pass, String retype, String fname, String lname, String mb, String mail)
	{
		users.click();
		crtUser.click();
		username.sendKeys(userName);
		password.sendKeys(pass);
		retypePass.sendKeys(retype);
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		mobile.sendKeys(mb);
		eMail.sendKeys(mail);
		userSubmit.click();
	}

	public void verifyUserCreate(WebDriver driver,int timeOutInSeconds, WebElement element,String text )
	{
		WebDriverWait wb = new WebDriverWait(driver, timeOutInSeconds);
		wb.until(ExpectedConditions.textToBePresentInElementValue(element, text));
		System.out.println("Test id passed, User Created");
	}
	
	public void deleteUser(WebDriver driver)
	{
	userList.click();
	deleteUser.click();
	Alert al = driver.switchTo().alert();
	al.accept();
	}
}
