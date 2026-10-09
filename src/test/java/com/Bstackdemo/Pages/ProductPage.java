package com.Bstackdemo.Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProductPage {

    private WebDriver driver;

  

    public ProductPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    
    
    // All Product Names
    @FindBy(xpath = "//div[@id]/p")
    List<WebElement> productNames;

    // All Product Prices
    @FindBy(xpath = "//div[@id]/div[3]/p")
    List<WebElement> productPrices;

    // All Add To Cart buttons
    @FindBy(xpath = "//div[@id]/div[4]")
    List<WebElement> addToCartButtons;


    
    public int getProductCount() {

        return productNames.size();
    }


    // Print Product Count
    public void printProductCount() {

        System.out.println("Total Products: " + productNames.size());
    }
    // Get all product names
    public void getAllProductNames() {

        for (WebElement product : productNames) {
            System.out.println(product.getText());
        }
    }


    // Get all product prices
    public void getAllProductPrices() {

        for (WebElement price : productPrices) {
            System.out.println(price.getText());
        }
    }


    // Click first product Add To Cart
    public void clickFirstProduct() {

        addToCartButtons.get(0).click();
    }


    // Click specific product by index
    public void clickProduct(int index) {

        addToCartButtons.get(index).click();
    }
    
    
    public void addProductToCart(int index) {

        addToCartButtons.get(index).click();

        System.out.println(
            "Product added to cart: " +
            productNames.get(index).getText()
        );
    }
}

    

    // iPhone 12 product

//    private By iphone12Name =
//            By.xpath("//*[@id='1']/p");
//
//    private By addToCart =
//            By.xpath("//*[@id='1']/div[4]");
//
//    private By cart =
//            By.className("float-cart__content");
//
//
//    public String getProductName() {
//
//        return wait.getText(iphone12Name);
//    }
//
//    public void clickAddToCart() {
//
//        wait.click(addToCart);
//    }
//
//    public void addProductToCart() {
//
//        clickAddToCart();
//    }
//
//    public boolean isCartDisplayed() {
//
//        return wait.isDisplayed(cart);
//    }
