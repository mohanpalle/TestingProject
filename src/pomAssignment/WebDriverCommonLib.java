package pomAssignment;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest{

	public String getTitle()
	{
		String TitleOfThePage = driver.getTitle();
		return TitleOfThePage;
	}
	
	public void verifyTitleOfTheWebPage(String actualTitle, String ExpectedTitle, String pageName)
	{
		if(actualTitle.equals(ExpectedTitle))
		{
			System.out.println("The "+pageName +" title is expected - Test is passed");
		}
		else
		{
			System.out.println("The "+pageName +" title is not as expected - Test is failed");
		}
		
	}
	
	public void waitForElement(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void waitForPageLoad(int time, String title)
	{
		WebDriverWait wb = new WebDriverWait(driver, time);
		wb.until(ExpectedConditions.titleContains(title));
	}
	
	public void mouseHover(WebElement source, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target);
	}
	
	public void selectByIndexDropDown(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectByVisibleTextDropDown(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectByValueDropDown(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public List<WebElement> getAllSelected(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> webElements = sel.getAllSelectedOptions();
		return webElements;
	}
	
	public void takesSnap(String folder, String fileName, String extension) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+folder+"/"+fileName+"."+extension+"");
		Files.copy(src, dest);
	}
	
	public void frameById(int id)
	{
		driver.switchTo().frame(id);
	}
	
	public void frameByAddress(String text)
	{
		driver.switchTo().frame(text);
	}
	
	public void waitForWebElement(long time, String text, WebElement element)
	{
		WebDriverWait wb = new WebDriverWait(driver, time);
		wb.until(ExpectedConditions.textToBePresentInElement(element, text));
		System.out.println("The Element is displayed and Test is passed for invalid Crendentials");
	}
	
	
}
