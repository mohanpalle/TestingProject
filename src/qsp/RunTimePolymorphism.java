package qsp;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RunTimePolymorphism {
	
	static RemoteWebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of the browser that you are want to launch");
		String  chosenBrowser=sc.next();
		
		if (chosenBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (chosenBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new  FirefoxDriver();
			
		}
		else {
			System.out.println("Please enter valid broweser name");
		}
		
}

}
