package com.Bstackdemo.TestCases;


	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Bstackdemo.Pages.Baseclass;
import com.Bstackdemo.Pages.CheckOutPage;

	

	public class CheckOutTest extends Baseclass
	
	{
		@BeforeClass
		public void pagesetup()
		{
			productpage= loginpage.login("demouser","testingisfun99");
			
			System.out.println("Product page initialized successfully");
		}

		  CheckOutPage cp;

		  
		  @Test(priority=1)
		  
			 public void validateCheckout()
			 {

				 cp.clickCheckout();
		  }
		    @Test(priority = 1)
		    public void enterShippingDetails() {

		        cp = new CheckOutPage(driver);

		        cp.enterFirstName("Mohan");
		        cp.enterLastName("Ram");
		        cp.enterAddress("123 Gandhipuram");
		        cp.enterState("Tamil Nadu");
		        cp.enterPostalCode("641012");

		        cp.clickSubmit();

		        System.out.println("Shipping details entered successfully");

		
}
	}