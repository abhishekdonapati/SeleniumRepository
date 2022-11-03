package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
	
	driver.get("https://www.google.com");
	System.out.println("Executing Chrome Driver in Headless mode.......");
	
	System.out.println(">> Page Title:"+driver.getTitle());
	System.out.println(">> page URL:"+driver.getCurrentUrl());
	}

}
