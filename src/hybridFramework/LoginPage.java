package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username") private WebElement username;
	@FindBy(name = "pwd") private WebElement pass;
	@FindBy(id = "loginButton") private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginProcess(String user, String passowrd)
	{
		username.sendKeys(user);
		pass.sendKeys(passowrd);
		loginBtn.click();
	}
}
