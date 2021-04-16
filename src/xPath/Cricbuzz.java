package xPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Cricbuzz {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/");
	
		driver.findElement(By.xpath("//a[@class='cb-mat-mnu-itm cb-ovr-flo' and @title='India v England, 4th Test - Live']")).click();
		driver.findElement(By.xpath("//a[@class='cb-nav-tab ' and .='Scorecard']")).click();
		
		/*
		 * String scr1India = driver.findElement(By.
		 * xpath("//div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']/descendant::span[.='India 1st Innings']"
		 * )).getText(); System.out.println(scr1India);
		 * 
		 * String Sgill = driver.findElement(By.
		 * xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/descendant::a[@class='cb-text-link' and contains(.,'Shubman Gill')]"
		 * )).getText(); System.out.println(Sgill);
		 */
		String india1 = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']/descendant::span[.='India 1st Innings']")).getText();
		String score1 = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']/descendant::span[@class='pull-right']")).getText();
		
		List<WebElement> bats = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/descendant::div[@class='cb-col cb-col-27 ']"));
		System.out.println(india1+" "+score1);
		
		/*
		 * for (WebElement webElement : bats) { String text=bats.
		 * System.out.println(bats); }
		 */
		driver.close();
	}
}
