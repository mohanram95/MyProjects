package com.Bstackdemo.Pages;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Get current URL
    public String getPageUrl() {

        return driver.getCurrentUrl();
    }

    // Get page title
    public String getPageTitle() {

        return driver.getTitle();
    }

    // Login method
    public ProductPage login(String user, String pass) {

        // Open Sign In page
        driver.get("https://bstackdemo.com/signin");

        // =========================
        // USERNAME DROPDOWN
        // =========================

        WebElement username = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("username")
                )
        );

        username.click();

        // Select demouser
        WebElement usernameOption = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("react-select-2-option-0-0")
                )
        );

        usernameOption.click();

        // =========================
        // PASSWORD DROPDOWN
        // =========================

        WebElement password = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("password")
                )
        );

        password.click();

        // Select password
        WebElement passwordOption = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("react-select-3-option-0-0")
                )
        );

        passwordOption.click();

        // =========================
        // LOGIN BUTTON
        // =========================

        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("login-btn")
                )
        );

        loginButton.click();
        
        return new ProductPage(driver);
    }
}








//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//
//
//public class LoginPage {
//
//    private WebDriver driver;
//    
//    
//    public LoginPage(WebDriver driver)
//    {
//    	
//    	this.driver= driver;
//    	
//    	PageFactory.initElements(driver, this);
//    }
//    
//    
//    @FindBy(xpath = "//span[@id='signin']")
//    
//    private WebElement signIn;
//    
//    @FindBy(id="username")
//    
//    private WebElement userName;
//    
//    @FindBy(id="password")
//    
//    private WebElement Password;
//    
//    @FindBy(xpath = "//span[text()='Sign In']")
//    
//    private WebElement Loginbutton;
//    
//     public String getpagetitle()
//    {
//		return driver.getTitle();
//    	
//    }
//    
//    public String getpageurl()
//    {
//		return driver.getCurrentUrl();
//    	
//    }
//    
//    
//    public void clicksignIn()
//    {
//    	signIn.click();
//    }
//    public void login(String username,String password)
//
//    {
//    	
//    	signIn.click();
//    	
//        userName.sendKeys(username);
//    	
//        Password.sendKeys(password);
//        
//        Loginbutton.click();
//    }
//    
//    
//   }