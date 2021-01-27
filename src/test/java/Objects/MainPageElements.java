package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageElements {

   public WebElement kozmetikTab;


    public MainPageElements(WebDriver driver) {

        kozmetikTab = driver.findElement(By.cssSelector("#navigation-wrapper .main-nav>li:nth-child(6)"));

    }

}


