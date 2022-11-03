package Demo;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class LoginPropertyFile {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
	    File src= new File("./TestResources/Login.Property");
	    FileInputStream fis = new FileInputStream(src);	
	 // Load the properties File
	    Properties prop = new Properties();
	    prop.load(fis);
	    
	    System.setProperty("webdriver.chrome.driver",prop.getProperty("ChromeDriver"));					
	    driver = new ChromeDriver();					
	    driver.get(prop.getProperty("url"));
	    
	    Thread.sleep(3000);
	    driver.manage().window().maximize();				
		   		
	    driver.findElement(By.name(prop.getProperty("username"))).sendKeys("Admin");
	    driver.findElement(By.name(prop.getProperty("password"))).sendKeys("admin123");
	    driver.findElement(By.xpath(prop.getProperty("loginButton"))).click();
	    
	    Thread.sleep(3000);
	    
	    //Assert.assertEquals(driver.getTitle(),"Your Account");

	   Assert.assertTrue(driver.findElement(By.xpath(prop.getProperty("user"))).getText().matches("[A-Z|a-z|\\W]+"));
	    
	    System.out.println(driver.findElement(By.xpath(prop.getProperty("user"))).getText());
	    
	    driver.close();					
	
	}

	}

