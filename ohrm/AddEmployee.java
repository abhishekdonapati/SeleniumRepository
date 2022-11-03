package ohrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployee
{

		
			public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.get(baseUrl);
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
			
			driver.findElement(By.name("firstName")).sendKeys("Joe");
			driver.findElement(By.name("middleName")).sendKeys("E");
			driver.findElement(By.name("lastName")).sendKeys("Root");
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).clear();
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("8674");
		//	driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]")).click();
			
			WebElement uploadElement = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]"));
			uploadElement.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			uploadElement.sendKeys("C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\JRoot.jpg");
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")).click();
			
			//driver.close();
	}

}
