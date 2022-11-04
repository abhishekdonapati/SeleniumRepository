package AutomationPractice;

	import java.io.IOException;
	import java.time.Duration;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;



	public class AddToCartAutomationPractice {
	    WebDriver driver;
	    AddToCartSignIn signinpage;
	    LoginAutomationPractice loginpage;
	    HomeAutomationPractice homepage;
	    
	    SignOutAutomationPractice signoutpage;
	    @BeforeTest
	     public void setup(){
	            String driverPath = "C:\\User\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe";
	            System.setProperty("webdriver.chrome.driver", driverPath);
	            
	            driver = new ChromeDriver();



	           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));



	           driver.get("http://automationpractice.com/index.php");
	            driver.manage().window().maximize();
	     }
	    @Test
	    public void automation() throws Exception {
	        
	        ///sigin app
	        signinpage = new AddToCartSignIn(driver);
	        signinpage.signin();
	        
	        // login application
	        loginpage = new LoginAutomationPractice(driver);
	        loginpage.login();
	        
	        // search product and select product
	        homepage = new HomeAutomationPractice(driver);
	        homepage.searchproduct();    



	       
	        signoutpage = new SignOutAutomationPractice(driver);
	        signoutpage.signout();
	    }
	    @AfterClass
	    public void close() {
	        driver.close();
	    }
	    
	}
