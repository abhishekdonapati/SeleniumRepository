package PFLogin;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class PFOHRMTest {
String driverPath = "C:\\\\\\\\Users\\\\\\\\AbhishekReddyDonapat\\\\\\\\OneDrive - Hallmark Health Care Solutions, Inc\\\\\\\\Desktop\\\\\\\\Selenium Web\\\\\\\\WebDriver\\\\\\\\chromedriver.exe";



  WebDriver driver;



  PFOHRMLoginPage objLoginPage;



  PFOHRMHomePage objHomePage;



  @BeforeTest



  public void setup(){



  System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();





      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);





      driver.get("https://opensource-demo.orangehrmlive.com/");





  }



  @Test(priority=0)



  public void test_Home_Page_Appear_Correct(){



   //Create Login Page object



  objLoginPage = new PFOHRMLoginPage(driver);



  //login to application
    objLoginPage.setUserName("Admin");
    objLoginPage.setPassword("admin123");
    objLoginPage.clickLogin();
   



  // go the next page



  objHomePage = new PFOHRMHomePage(driver);



  //Verify home page



  Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches(".*"));
    driver.close();
    }
        





}