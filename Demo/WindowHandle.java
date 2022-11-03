package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WindowHandle {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\HTML pages\\PopUpWin.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String parentwindow = driver.getWindowHandle().toString();
		
		driver.findElement(By.name("Open")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.switchTo().window("PopupWindow");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Hallmark Healthcare Solutions");
		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.close();
		
		driver.switchTo().window(parentwindow);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.close();
		
	}

}
