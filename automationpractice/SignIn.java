package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	String baseUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	driver.get(baseUrl);
	driver.findElement(By.id("email")).sendKeys("hgdyrtyggy@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Naveen@123");
	
	driver.findElement(By.id("SubmitLogin")).click();
	
	if(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).isDisplayed()) {
		System.out.println("The confirmation message says- "+driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText());
	}
			else
		{
		driver.navigate().back();
	}

	
	driver.close();

}	
	
}

