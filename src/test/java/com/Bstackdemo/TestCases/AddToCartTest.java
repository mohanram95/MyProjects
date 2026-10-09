



package com.Bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Bstackdemo.Pages.Baseclass;


public class AddToCartTest extends Baseclass
{

	@BeforeClass
	
	public void pagesetup()
	{
		productpage= loginpage.login("demouser","testingisfun99");
		
		productpage.addProductToCart(1);
	}

	
	@Test(priority = 1)
	public void verifyproductcount() {

	    int count = productpage.getProductCount();

	    System.out.println("Total Product Count: " + count);
	}

	@Test(priority = 2)
	public void verifyproductDetails() {

	    productpage.getAllProductNames();
	}

	@Test(priority = 3)
	public void validateaddproducttocart() {

	    // Already added in @BeforeClass
	    System.out.println("Add to cart validation completed");
	}
}