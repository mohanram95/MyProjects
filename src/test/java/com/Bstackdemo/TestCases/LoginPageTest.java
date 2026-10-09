package com.Bstackdemo.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Bstackdemo.Pages.Baseclass;

public class LoginPageTest  extends Baseclass

{
  
	
	@Test(priority=1)
  public void verifyurl() 
  
  {
	  
	String appurl=	loginpage.getPageUrl();
	
	Assert.assertTrue(appurl.contains("bstackdemo"));
	
	System.out.println("url matched:"+appurl);
	
  }
	@Test(priority=2)
	  public void verifytitle() 
	  
	  {
		  
		
		String apptitle=loginpage.getPageTitle();
		Assert.assertTrue(apptitle.contains("StackDemo"));
		  System.out.println("title matched:"+apptitle);
		  
	  }
	@Test(priority=3)
	  public void validatelogin() 
	  
	{
		  
		loginpage.login("demouser","testingisfun99");
		
		 Assert.assertTrue(loginpage.getPageUrl().contains("signin"));
		 
		 System.out.println("login completed.... user navigated to homepage");
	  }
}
