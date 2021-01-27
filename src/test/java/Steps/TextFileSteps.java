package Steps;

import Base.BaseStep;
import GenFunctions.CommonFunctions;
import GenFunctions.WaitFunc;
import Objects.LoginPageElements;
import Objects.MainPageElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class TextFileSteps extends BaseStep {
    public WaitFunc waitFunc;
    public CommonFunctions commonFunctions;


    public TextFileSteps()  {

        waitFunc = new WaitFunc(driver);
        commonFunctions = new CommonFunctions(driver);
    }



    @Given("^gt$")
    public void goToSignInPage() throws Exception {

        geturl();
        waitFunc.threadSleep(5);
    }

    @When("^ti$")
    public void loginWithFacebook() throws InterruptedException {

        CommonFunctions commonFunctions = new CommonFunctions(driver);
        commonFunctions.scroolDown();


        try {
            File file = new File("output.txt");
            if(!file.exists()){
                file.createNewFile();
            }


            FileWriter fw = new FileWriter(file);

            List<WebElement> asd = driver.findElements(By.cssSelector(".footer a"));


            for(int i=0;i<asd.size();i++){
                fw.write(asd.get(i).getAttribute("href") + "\n");

            }

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


