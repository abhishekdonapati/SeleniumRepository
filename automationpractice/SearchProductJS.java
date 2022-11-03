package automationpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductJS {

			
		   public static void main(String[] args) throws Exception {
		        // TODO Auto-generated method stub
		        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\AbhishekReddyDonapat\\\\OneDrive - Hallmark Health Care Solutions, Inc\\\\Desktop\\\\Selenium Web\\\\WebDriver\\\\chromedriver.exe");



		       WebDriver driver = new ChromeDriver();
		        String url ="http://automationpractice.com/index.php";
		        driver.get(url);
		        driver.manage().window().maximize();
		        JavascriptExecutor js = (JavascriptExecutor)driver;
		        Thread.sleep(8000);
		        js.executeScript("alert('Welcome to AutomationPractice')");
		        Alert alt = driver.switchTo().alert();
		        alt.accept();
		        
		        
		        js.executeScript("document.getElementsByName(\"search_query\")[0].value=\"Red Tshirt\"");
		        js.executeScript("document.getElementsByName(\"submit_search\")[0].click()");
		        
		        Thread.sleep(5000);
		        
		        
		        
		       // driver.close();



		   }



	}


