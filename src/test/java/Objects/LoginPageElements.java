package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {

    public WebElement loginemail;
    public WebElement loginpassword;
    public WebElement girisyap;


    public LoginPageElements(WebDriver driver) {

        loginemail = driver.findElement(By.cssSelector("#login-email"));
        loginpassword = driver.findElement(By.cssSelector("#login-password-input"));
        girisyap = driver.findElement(By.cssSelector(".q-primary"));
    }
}
