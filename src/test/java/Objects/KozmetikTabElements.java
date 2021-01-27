package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KozmetikTabElements {

    public WebElement parfum;


    public KozmetikTabElements(WebDriver driver) {

        parfum      = driver.findElement(By.cssSelector(".slick-list>.slick-track div:nth-child(2)"));


    }
}
