package pomAssignment;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	@FindBy(xpath = "//a[@href='/reports/reports.do']") private WebElement report;
	@FindBy(xpath = "//a[@href='/administration/administration.do']") private WebElement setting;
	@FindBy(xpath = "//select[@name='firstHierarchyLevelCode']") private WebElement dropDown1;
	@FindBy(xpath= "//select[@name='secondHierarchyLevelCode']") private WebElement dropDown2;
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getReport() {
		return report;
	}


	public WebElement getSetting() {
		return setting;
	}

	public WebElement getDropDown1() {
		return dropDown1;
	}

	public WebElement getDropDown2() {
		return dropDown2;
	}
	
	public void getDropDownOptions(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> ops = sel.getOptions();
		
		for(WebElement we:ops) {
			String data = we.getText();
			System.out.println(data);
		}
	}
	

}
