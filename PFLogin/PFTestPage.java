package PFLogin;

	

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class PFTestPage
	{
	String driverPath = "C:\\Users\\AbhishekReddyDonapat\\\\OneDrive - Hallmark Health Care Solutions, Inc\\\\Desktop\\\\Selenium Web\\\\WebDriver\\\\chromedriver.exe";
	    
	    WebDriver driver;

	    PFLoginPage objLoginPage;

	    PFHomePage objHomePage;
	    
	    PFSignIn objSignInPage;

	    @BeforeTest

	    public void setup(){

		System.setProperty("webdriver.chrome.driver", driverPath);
	        
	        driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://automationpractice.com/index.php");

	    }

	    
	    @Test(priority=0)

	    public void test_Home_Page_Appear_Correct(){
	    	
	    objSignInPage = new PFSignIn(driver);
	    objSignInPage.clickLogin();
	   

	    objLoginPage = new PFLoginPage(driver);
        objLoginPage.loginToAP(driverPath, driverPath);
	    
	    
	 
	    objHomePage = new PFHomePage(driver);
        objHomePage.getHomePageDashboardUserName();
	    

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches(".*"));
	    driver.close();
	    }
	        
	}

