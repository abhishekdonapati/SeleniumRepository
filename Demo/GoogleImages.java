package Demo;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImages {
	private static XSSFWorkbook workbook;

		
		public static void main(String[] args) throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\WebDriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			FileInputStream fis = new FileInputStream("C:\\Users\\AbhishekReddyDonapat\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Test data\\GoogleImages.xlsx");
			 workbook = new XSSFWorkbook(fis);
			 XSSFSheet ws = workbook.getSheetAt(0);
			 
			 int rownum  = ws.getLastRowNum();
			 int colnum = ws.getRow(0).getPhysicalNumberOfCells();
			 System.out.println(colnum);
			 System.out.println(rownum);
			 XSSFCell searchkey;
			 for(int i = 1; i <= rownum ; i++) {
				 driver.get("http://www.google.com");
				 searchkey= ws.getRow(i).getCell(0);
				 System.out.println("Google search image for: "+searchkey);
				 driver.findElement(By.linkText("Images")).click();
				 driver.findElement(By.name("q")).sendKeys(searchkey.toString());
				
				 //driver.findElement(By.xpath("//span[@class='z1asCe MZy1Rb']//*[@focusable='false']")).click();
				 			 
				 WebElement textbox = driver.findElement(By.name("q"));
				 textbox.sendKeys(Keys.RETURN);
				 
				
				 
				 Thread.sleep(3000);
				 String title = driver.getTitle();
				 System.out.println(driver.getTitle());
				 if(driver.getTitle().matches("[A-Z|a-z|0-9|\\W]+")) {
	                    System.out.println("matches");
	                 }
	                 else {
	                     System.out.println("not matches");
	                 }
				// System.out.println("Pattern.matcehs[.*]+," +title);
				 
				 System.out.println(driver.getTitle());
				 
				 driver.navigate().back();
				 
			 }
			 driver.close();	
		}
	}
			


