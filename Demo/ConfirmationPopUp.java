package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//String baseUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//iframe[@id='iframeResult']")).click();



	try
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.alertIsPresent());
		String alrt = driver.switchTo().alert().getText();
		System.out.print(alrt);
		driver.switchTo().alert().dismiss();
	}
catch(Exception ex)
	{
	System.out.println(ex);
}
	}
}
