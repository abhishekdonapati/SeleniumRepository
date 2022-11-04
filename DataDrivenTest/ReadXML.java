package DataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class ReadXML {
	static String driverpath= "C:\\\\Users\\\\AbhishekReddyDonapat\\\\OneDrive - Hallmark Health Care Solutions, Inc\\\\Desktop\\\\Selenium Web\\\\WebDriver\\\\chromedriver.exe";
	RemoteWebDriver driver;

	@Test
	@Parameters({"Product"})
	public void login(@Optional("evening dresses")String Product) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",driverpath);			
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(Product);
		 driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
		 
	}
}
