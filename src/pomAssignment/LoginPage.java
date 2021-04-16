package pomAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
		@FindBy(name="username") private WebElement usn;
		@FindBy(name="pwd") private WebElement psw;
		@FindBy(id="loginButton") private WebElement loginBtn;
		@FindBy(xpath="//img[contains(@src, 'logo')]") private WebElement logo;
		@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;

		//Initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
		}
		
		//Utilization

		public WebElement getUsn() {
			return usn;
		}

		public WebElement getPsw() {
			return psw;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}

		public WebElement getLogo() {
			return logo;
		}

		public WebElement getCheckBox() {
			return checkBox;
		}	

		
		
		//Generic Resuable method
		public void loginProcess(String validUsername, String validPassword) throws InterruptedException
		{
			usn.sendKeys(validUsername);
			psw.sendKeys(validPassword);
			Thread.sleep(2000);
			loginBtn.click();
		}
		
		public void invalidProcess(String invalidPassword, String invalidUsername) throws InterruptedException
		{
			usn.clear();
			usn.sendKeys(invalidUsername);
			psw.sendKeys(invalidPassword);
			Thread.sleep(2000);
			loginBtn.click();
		}
		

}
