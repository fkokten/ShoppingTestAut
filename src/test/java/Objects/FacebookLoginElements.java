package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginElements {


    public WebElement mailOrTel;
    public WebElement password;
    public WebElement girisYapButton;


    public FacebookLoginElements(WebDriver driver) {

        mailOrTel = driver.findElement(By.cssSelector("#email_container"));

        password = driver.findElement(By.cssSelector("#pass"));

        girisYapButton = driver.findElement(By.cssSelector("girisYapButton"));

    }
}
