package Objects;

import GenFunctions.WaitFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FavoriMethods {

    private WebDriver driver;
    private WaitFunc waitFunc;

    public FavoriMethods(WebDriver driver) {
        this.driver = driver;
        this.waitFunc = new WaitFunc(driver);
    }


    public String getProductId() throws Exception {
        WebElement urunId = driver.findElement(By.cssSelector(".pr-cn .pr-in-cn .pr-new-br span"));

        return urunId.getText();
    }
}
