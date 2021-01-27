package Steps;

import Base.BaseStep;
import GenFunctions.CommonFunctions;
import GenFunctions.ReadRequirementData;
import GenFunctions.WaitFunc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import Objects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginSteps extends BaseStep  {

    public WaitFunc waitFunc;
    public CommonFunctions commonFunctions;


    public LoginSteps()  {

        waitFunc = new WaitFunc(driver);
        commonFunctions = new CommonFunctions(driver);
    }



    @Given("^go to web site page$")
    public void     goToSignInPage() throws Exception {

        geturl();

        LoginPageElements1 loginPageElements1 = new LoginPageElements1(driver);
        loginPageElements1.close.click();
        loginPageElements1.giris.click();
        waitFunc.threadSleep(3);
    }

    @When("^Login ol$")
    public void LoginOl() throws InterruptedException {
        ReadRequirementData readRequirementData = new ReadRequirementData();
        LoginPageElements loginPageElements = new LoginPageElements(driver);
        loginPageElements.loginemail.sendKeys(readRequirementData.readData("email"));
        loginPageElements.loginpassword.sendKeys(readRequirementData.readData("password"));
        waitFunc.threadSleep(2);
        loginPageElements.girisyap.click();


    }

    @When("^go to Kozmetik$")
    public void gotoKozmetik() throws InterruptedException {
        waitFunc.threadSleep(5);
        MainPageElements mainPageElements = new MainPageElements(driver);
        mainPageElements.kozmetikTab.click();

        waitFunc.threadSleep(5);

        Assert.assertEquals("https://www.trendyol.com/butik/liste/kozmetik",driver.getCurrentUrl());

    }

    @And("^parfum Side$")
    public void parfumSide() throws Exception {

        KozmetikTabElements kozmetikTabElements = new KozmetikTabElements(driver);
        kozmetikTabElements.parfum.click();
        waitFunc.threadSleep(5);


        ReadRequirementData readRequirementData = new ReadRequirementData();

        ParfumElements parfumElements = new ParfumElements(driver);
        parfumElements.markaAra.sendKeys(readRequirementData.readData("marka"));
        waitFunc.threadSleep(2);

        WebElement lacoste = driver.findElement(By.cssSelector(".fltrs-wrppr a[href*='/lacoste-parfum-ve-deodorant-x-b138-c103717']>.chckbox"));
        lacoste.click();
        waitFunc.threadSleep(2);

        ParfumeDetayElements parfumeDetayElements = new ParfumeDetayElements(driver);
        parfumeDetayElements.urunSec.click();

        waitFunc.threadSleep(4);

        FavoriElements favoriElements = new FavoriElements(driver);
        favoriElements.favorilereEkle.click();

        FavoriMethods favoriMethods =new FavoriMethods(driver);
        String id  = favoriMethods.getProductId();

        getHesabimUrl();

        String urunName =  driver.findElement(By.cssSelector(".prdct-desc-cntnr-wrppr .prdct-desc-cntnr-ttl-w span:nth-child(2)")).getText();

        Assert.assertEquals(id,urunName,"Favori urunler dogrulanamadı");


    }




}
