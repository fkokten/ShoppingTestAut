package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FavoriElements {

    public WebElement favorilereEkle;


    public FavoriElements(WebDriver driver) {

        favorilereEkle = driver.findElement(By.cssSelector(".pr-in-at .fv-hv-img"));


    }
}
