package com.Bstackdemo.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Baseclass 
{

	
	protected WebDriver driver;
	
	protected LoginPage loginpage;
	
	protected ProductPage productpage;
	
	protected CartPage cartpage;
	
	protected CheckOutPage checkoutpage;
	
	
	
	 @Parameters("browser")
	    @BeforeTest
	    public void setup(String browser) {

	        System.out.println("Browser received from XML: " + browser);

	        if (browser.equalsIgnoreCase("chrome")) {

	            driver = new ChromeDriver();

	        } else if (browser.equalsIgnoreCase("edge")) {

	            driver = new EdgeDriver();

	        } else if (browser.equalsIgnoreCase("firefox")) {

	            driver = new FirefoxDriver();

	        } else {

	            throw new RuntimeException("Invalid browser: " + browser);
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        driver.get("https://bstackdemo.com/");

	        loginpage = new LoginPage(driver);
	        
	        productpage = loginpage.login("demouser", "testingisfun99");
	        
	      
	        productpage= new ProductPage(driver);
	        
	        cartpage= new CartPage(driver);
	        
	        checkoutpage= new CheckOutPage(driver);
	   
	        System.out.println("Login completed successfully");
	        System.out.println("Started browser: " + browser);
	    }

	    @AfterTest
	    public void tearDown() {

//	        if (driver != null) {
//	            driver.quit();
//	        }
	    }
	}

	
	
	
//	@Parameters({"bname"})
//	
//@BeforeClass
//	public void setup(String bname)
//	{
//		
//		switch(bname.toLowerCase().trim())
//		{
//		
//		case "chrome":driver= new ChromeDriver();break;
//		case "edge":driver= new ChromeDriver();break;
//		case "firefox":driver= new ChromeDriver();break;
//		
//		default:driver= new ChromeDriver();break;
//		
//		}
//		
//		
////		 if (bname.equalsIgnoreCase("chrome")) {
////
////	            driver = new ChromeDriver();
////
////	        } else if (bname.equalsIgnoreCase("edge")) {
////
////	            driver = new EdgeDriver();
////
////	        } else if (bname.equalsIgnoreCase("firefox")) {
////
////	            driver = new FirefoxDriver();
////
////	        } else {
////
////	            throw new IllegalArgumentException(
////	                    "Invalid browser: " + bname
////	            );
////	        }
////	
//		
//		
//		driver = new ChromeDriver();
//
//      driver.manage().window().maximize();
//      
//      driver.manage().timeouts()
//             .implicitlyWait(Duration.ofSeconds(10));
//
//      driver.get("https://bstackdemo.com/");
//       
//       loginpage= new LoginPage(driver);
//        
//        
//	}
//	
//	@AfterClass
//	public void teardown()
//	{
//		 driver.quit();
//		
//	}
//}
