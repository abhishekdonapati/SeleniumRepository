package AutomationPractice;


import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignOutAutomationPractice {
    WebDriver driver;
    @FindBy(linkText="Sign out")
    WebElement sign_out;
    public SignOutAutomationPractice(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void signout() {
        sign_out.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
