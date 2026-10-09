package com.blazedemo.PageFactory.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.balzedemo.PageFactory.Page.ConfirmationPage;
import com.balzedemo.PageFactory.Page.HomePage;
import com.balzedemo.PageFactory.Page.ReservePage;

public class BaseClass {

    public WebDriver driver;
    public HomePage hp;
    public ReservePage rp;
    public ConfirmationPage cp;

    @BeforeClass
    public void setup() {

        System.out.println("===== SETUP STARTED =====");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://blazedemo.com");

        hp = new HomePage(driver);
        rp = new ReservePage(driver);
        cp = new ConfirmationPage(driver);

        System.out.println("Browser URL: " + driver.getCurrentUrl());
        System.out.println("===== SETUP COMPLETED =====");
    }

    @AfterClass
    public void tearDown() {

        System.out.println("===== TEARDOWN =====");

        if (driver != null) {
            driver.quit();
        }
    }
}