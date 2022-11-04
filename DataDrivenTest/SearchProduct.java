package DataDrivenTest;

import java.io.FileReader;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Iterator;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;

public class SearchProduct {

	static String driverPath = "C:\\\\Users\\\\AbhishekReddyDonapat\\\\OneDrive - Hallmark Health Care Solutions, Inc\\\\Desktop\\\\Selenium Web\\\\WebDriver\\\\chromedriver.exe";
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",driverPath);			
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		CSVReader reader = new CSVReader(new FileReader("./TestResources/Product.csv"));
		
		java.util.List<String[]> li=reader.readAll();
		  System.out.println("Total rows that we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
			 String[] str=i1.next();
		 
			 driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(str[0]);
			 driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
			 
			 driver.navigate().back();
			 driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
						 
					 }	   
		// driver.close();
		}
}