package com.balzedemo.PageFactory.Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departure;

    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement destination;

    @FindBy(xpath = "//input[@value='Find Flights']")
    private WebElement findflightbutton;


    public HomePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    public void selectDeparturecity(String city) {

        Select select = new Select(departure);

        select.selectByVisibleText(city);
    }


    public void selectDestinationcity(String city) {

        Select select = new Select(destination);

        select.selectByVisibleText(city);
    }


    public void clickFindFlights() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(findflightbutton)
        );

        findflightbutton.click();

        wait.until(
                ExpectedConditions.urlContains("reserve")
        );

        System.out.println("Find Flights completed");
    }


    public void verifytitle() {

        String acttitle = driver.getTitle();

        Assert.assertTrue(
                acttitle.contains("Demo"),
                "Title not matched"
        );

        System.out.println("Title verified: " + acttitle);
    }
}