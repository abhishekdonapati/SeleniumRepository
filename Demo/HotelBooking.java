package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String baseUrl = "C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\HTML pages\\hotelbooking.html";
		driver.get(baseUrl);
		//driver.navigate().to(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Implicit Wait without condition
		
		String Title=driver.getTitle();
		System.out.println("The title of the page is "+Title);
		// Displaying page title
		
		String url=driver.getCurrentUrl();
		System.out.println("The URL of the page is "+url);
		//Displaying page url
		
		driver.findElement(By.id("txtFirstName")).sendKeys("Abhishek");
		driver.findElement(By.id("txtLastName")).sendKeys("Reddy");
		driver.findElement(By.id("txtEmail")).sendKeys("abhishekr@yopmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("9885708674");
		
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("Skyline Apt,Newtown");
		

		Select drpCity= new Select(driver.findElement(By.name("city")));
		drpCity.selectByVisibleText("Hyderabad");
				
		Select drpState= new Select(driver.findElement(By.name("state")));
		drpState.selectByIndex(4);
		
		Select drpGuest= new Select(driver.findElement(By.name("persons")));
		drpGuest.selectByValue("4");
				
		WebElement TxtGuestCount = driver.findElement(By.id("rooms"));
		System.out.println("Total number of rooms booked is "+TxtGuestCount.getText());
	
		driver.findElement(By.id("txtCardholderName")).sendKeys("Abhishek");
		driver.findElement(By.id("txtDebit")).sendKeys("345678945678");
		driver.findElement(By.id("txtCvv")).sendKeys("123");
		driver.findElement(By.id("txtMonth")).sendKeys("09");
		driver.findElement(By.id("txtMonth")).sendKeys("09");
		driver.findElement(By.id("txtYear")).sendKeys("2030");
		driver.findElement(By.id("btnPayment")).click();
		
	
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("/html/body/h1")).isDisplayed()) {
			System.out.println("The confirmation message says- "+driver.findElement(By.xpath("/html/body/h1")).getText());
			
		}
		else
		{
			driver.navigate().back();
			
		}
		
		driver.close();
		driver.quit();
	}	


	}


