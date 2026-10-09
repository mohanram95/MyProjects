package com.Bstackdemo.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage {

    private WebDriver driver;



    public CartPage(WebDriver driver) {

        this.driver = driver;

       PageFactory.initElements(driver, this);
    }

   
    @FindBy(xpath = "(//div[@class='shelf-item__buy-btn'])[1]")
   
    private WebElement addToCartButton;
    
    public void addProductToCart(int productNumber) {

        String xpath = "(//div[@class='shelf-item__buy-btn'])[" + productNumber + "]";

        driver.findElement(By.xpath(xpath)).click();

        System.out.println("Product added to cart");
    }
    
    
    
}