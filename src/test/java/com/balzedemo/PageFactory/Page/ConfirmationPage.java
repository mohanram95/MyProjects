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

public class ConfirmationPage 

{

	
	private WebDriver driver;
	
	public ConfirmationPage(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@id='inputName']")
	
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='address']")
	
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	
	WebElement city;
	
	@FindBy(xpath = "//input[@id='state']")
	
	WebElement state;
	
	@FindBy(xpath ="//input[@id='zipCode']")
	
	WebElement zipcode;
	
	@FindBy(xpath ="//select[@name='cardType']")
	
	WebElement cardType;
	
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	
	WebElement creditcardnumer;
	
	@FindBy(xpath ="//input[@id='creditCardMonth']")
	
	WebElement month;
	
	@FindBy(xpath="//input[@id='creditCardYear']")
	
	WebElement year;
	
	@FindBy(xpath = "//input[@id='nameOnCard']")
	
	WebElement nameoncard;
	
	@FindBy(xpath = "//input[@type='submit']")
	
	WebElement purchaseflight;
	
	
	public void enterFirstname(String name)
	{
		firstname.sendKeys(name);
	}
	
	public void enterAddress(String addr) {
        address.sendKeys(addr);
    }

    // City
    public void enterCity(String cityName) {
        city.sendKeys(cityName);
    }
	
    // State
    public void enterState(String stateName) {
        state.sendKeys(stateName);
    }

    // Zip Code
    public void enterZipCode(String zip) {
        zipcode.sendKeys(zip);
    }

    // Card Type - Dropdown
    public void selectCardType(String cardName) {
        Select select = new Select(cardType);
        select.selectByVisibleText(cardName);
    }

    // Credit Card Number
    public void enterCreditCardNumber(String cardNumber) {
        creditcardnumer.sendKeys(cardNumber);
    }

    // Month
    public void enterMonth(String cardMonth) {
        month.clear();
        month.sendKeys(cardMonth);
    }
    
 // Year
    public void enterYear(String cardYear) {
        year.clear();
        year.sendKeys(cardYear);
    }

    // Name on Card
    public void enterNameOnCard(String cardName) {
        nameoncard.sendKeys(cardName);
    }

    // Purchase Flight
    public void clickPurchaseFlight() {

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(purchaseflight));

        System.out.println("Before Purchase URL: " + driver.getCurrentUrl());

        purchaseflight.click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains("confirmation"));

        System.out.println("After Purchase URL: " + driver.getCurrentUrl());
        System.out.println("Purchase Flight completed successfully");
    }
}
