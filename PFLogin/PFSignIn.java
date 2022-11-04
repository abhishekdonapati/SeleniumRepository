package PFLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PFSignIn {
 WebDriver driver;
 By sign = By.xpath("//a[contains(text(),'Sign in')]");
 public PFSignIn(WebDriver driver)
 {
	 this.driver=driver;
 }
public void clickLogin()
{
	driver.findElement(sign).click();
}
}
