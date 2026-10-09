package com.Bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Bstackdemo.Pages.Baseclass;
import com.Bstackdemo.Pages.ProductPage;

public class ProductDetailsTest extends Baseclass
{
	
	
//	@BeforeClass
//	public void pagesetup()
//	{
//		productpage= loginpage.login("demouser","testingisfun99");
//		
//		System.out.println("Product page initialized successfully");
//	}
//	
  @Test(priority=1)
  public void verifyproductcount() 
  {
	
int count=	  productpage.getProductCount();

//Assert.assertEquals(count, );

System.out.println("Total Product Count: " + count);

  }
  
  
  @Test(priority=2)
  public void verifyproductDetails() 
  {
	  
	  productpage.getAllProductNames();
  }
  
  @Test(priority=3)
  public void validateaddproducttocart() 
  {
	  productpage.addProductToCart(1);
	  
  }
}
