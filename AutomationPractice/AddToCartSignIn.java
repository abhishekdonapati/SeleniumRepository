package AutomationPractice;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AddToCartSignIn {
    WebDriver driver;
    @FindBy(linkText="Sign in")
    WebElement sign;
    public AddToCartSignIn(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void signin() {
        sign.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



}