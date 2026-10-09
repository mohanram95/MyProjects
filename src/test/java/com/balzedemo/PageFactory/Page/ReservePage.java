package com.balzedemo.PageFactory.Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReservePage 
{
	
	
	private WebDriver driver;
	
	public  ReservePage(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="(//input[@value='Choose This Flight'])[1]")
	
	WebElement chooseFlight;
	
	
	public void verifychooseflight()
	
	{
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(chooseFlight));
		
		chooseFlight.click();
		
		 new WebDriverWait(driver, Duration.ofSeconds(10))
         .until(ExpectedConditions.urlContains("purchase"));
		
		Assert.assertTrue(driver.getCurrentUrl().contains("purchase"), "Choose This Flight failed");
		
		System.out.println("purchase completed");
	}

}
