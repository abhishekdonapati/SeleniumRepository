package DataDrivenTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataProvider {
 WebDriver driver;
 
@BeforeTest
	
	public void launchapp() throws InterruptedException
	{
	String driverpath= "C:\\\\Users\\\\AbhishekReddyDonapat\\\\OneDrive - Hallmark Health Care Solutions, Inc\\\\Desktop\\\\Selenium Web\\\\WebDriver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);			
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
@AfterTest
public void closeApp() {driver.close();}

	@DataProvider(name="Testdata")
	public Object[] getdata()
	{
		Object[] data = new Object[3];
		data[0]="Summer dress";
		data[1]="casul dress";
		data[2]="evening dress";
		return  data;
	}

@Test(dataProvider="Testdata")

public void Search(String Product) throws Exception
{
	 driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(Product);
	 driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	 Thread.sleep(3000);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
	}
}
