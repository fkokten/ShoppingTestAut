package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParfumElements {

    public WebElement markaAra;



    public ParfumElements(WebDriver driver) {

        markaAra      = driver.findElement(By.cssSelector(".fltr-srch-inpt"));



    }
}
