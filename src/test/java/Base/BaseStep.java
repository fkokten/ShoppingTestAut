package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseStep {
    public WebDriver driver;

    public BaseStep()

    {
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", workingDir + "/src/test/java/Driver/chromedriver.exe");

    }

    public void geturl()
    {
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-dev-shm-usage");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.get("https://www.trendyol.com");

    }

    public void getHesabimUrl()
    {


        driver.get("https://www.trendyol.com/Hesabim/Favoriler");

    }



    public void driverQuit() {
        driver.quit(); }
    }
