package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParfumeDetayElements {

    public WebElement urunSec;


    public ParfumeDetayElements(WebDriver driver) {

        urunSec = driver.findElement(By.cssSelector(".prdct-cntnr-wrppr div:nth-child(7) .p-card-img"));


    }
}
