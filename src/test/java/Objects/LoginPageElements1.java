package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements1 {

    public WebElement close;
    public WebElement giris;


    public LoginPageElements1(WebDriver driver) {


        close      = driver.findElement(By.cssSelector(".fancybox-item"));
        giris      = driver.findElement(By.cssSelector(".i-user-orange"));

    }
}