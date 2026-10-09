package com.Bstackdemo.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheckOutPage {

    private WebDriver driver;



    public CheckOutPage(WebDriver driver) {

        this.driver = driver;

 PageFactory.initElements(driver,this);
   
    }
    
//    
//    @FindBy(xpath="//div[@class='buy-btn']")
//    
//private WebElement checkoutbutton;
    
    
    @FindBy(xpath="//div[contains(@class,'buy-btn')]")
    private WebElement checkoutbutton;
    
    @FindBy(xpath="//input[@id='firstNameInput']")
    
   private WebElement firstname;
    
    @FindBy(xpath="//input[@id='lastNameInput']")
    
    private WebElement lastname;
    
    @FindBy(xpath="//input[@id='addressLine1Input']")
    
    private WebElement address;
    
    @FindBy(xpath="//input[@id='provinceInput']")
    
    private WebElement state;
    
    @FindBy(xpath="//input[@id='postCodeInput']")
    
    private WebElement postalcode;
    
    @FindBy(xpath="//button[@id='checkout-shipping-continue']")
    
    private WebElement submitbutton;
    
    public void clickCheckout() 
    {

        checkoutbutton.click();

        System.out.println("Checkout button clicked successfully");
    }
    
    
    public void enterFirstName(String fname) {
        firstname.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        lastname.sendKeys(lname);
    }

    public void enterAddress(String addr) {
        address.sendKeys(addr);
    }

    public void enterState(String statename) {
        state.sendKeys(statename);
    }

    public void enterPostalCode(String pcode) {
        postalcode.sendKeys(pcode);
    }

    public void clickSubmit() {
        submitbutton.click();
    }
   
    
    
   
    
//    private By firstName =
//            By.id("firstName");
//
//    private By lastName =
//            By.id("lastName");
//
//    private By address =
//            By.id("address");
//
//    private By state =
//            By.id("state");
//
//    private By postalCode =
//            By.id("postalCode");
//
//    private By submitButton =
//            By.xpath("//button[contains(text(),'Submit')]");
//
//
//    public void enterFirstName(String name) {
//
//        wait.sendKeys(firstName, name);
//    }
//
//    public void enterLastName(String name) {
//
//        wait.sendKeys(lastName, name);
//    }
//
//    public void enterAddress(String value) {
//
//        wait.sendKeys(address, value);
//    }
//
//    public void enterState(String value) {
//
//        wait.sendKeys(state, value);
//    }
//
//    public void enterPostalCode(String value) {
//
//        wait.sendKeys(postalCode, value);
//    }
//
//    public void clickSubmit() {
//
//        wait.click(submitButton);
//    }
//
//    public void enterCheckoutDetails(
//            String fname,
//            String lname,
//            String addr,
//            String stateName,
//            String zip) {
//
//        enterFirstName(fname);
//
//        enterLastName(lname);
//
//        enterAddress(addr);
//
//        enterState(stateName);
//
//        enterPostalCode(zip);
//    }
}