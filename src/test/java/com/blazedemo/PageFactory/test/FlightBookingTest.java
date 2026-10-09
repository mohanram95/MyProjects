package com.blazedemo.PageFactory.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.blazedemo.PageFactory.Base.BaseClass;

public class FlightBookingTest extends BaseClass {

    @Test(priority = 1, groups = {"smoke"})
    public void verifytitle() 
    {

        System.out.println("===== TITLE TEST =====");
        System.out.println("Driver: " + driver);

        hp.verifytitle();
    }

    @DataProvider(name = "cardData")
    public Object[][] cardData() {

        return new Object[][] {

            {"Mohan", "123 Main Road", "Coimbatore", "Tamil Nadu",
             "641005", "Visa", "4111111111111111", "10", "2028", "Mohan"},

            {"Kumar", "456 Gandhi Road", "Chennai", "Tamil Nadu",
             "600001", "Visa", "4012888888881881", "11", "2029", "Kumar"},

            {"Rahul", "789 MG Road", "Bangalore", "Karnataka",
             "560001", "Visa", "4222222222222222", "12", "2030", "Rahul"}
        };
    }

    @Test(
    	    priority = 2,
    	    dataProvider = "cardData",
    	    groups = {"functional"}
    	)
    	public void purchaseFlight(
    	        String name,
    	        String address,
    	        String city,
    	        String state,
    	        String zipcode,
    	        String cardType,
    	        String cardNumber,
    	        String month,
    	        String year,
    	        String nameOnCard) {

    	    driver.get("https://blazedemo.com");

    	    hp.selectDeparturecity("Boston");
    	    hp.selectDestinationcity("New York");

    	    hp.clickFindFlights();

    	    rp.verifychooseflight();

    	    cp.enterFirstname(name);
    	    cp.enterAddress(address);
    	    cp.enterCity(city);
    	    cp.enterState(state);
    	    cp.enterZipCode(zipcode);
    	    cp.selectCardType(cardType);

    	    cp.enterCreditCardNumber(cardNumber);

    	    cp.enterMonth(month);
    	    cp.enterYear(year);
    	    cp.enterNameOnCard(nameOnCard);

    	    cp.clickPurchaseFlight();
    	}
    
    
    @DataProvider(name = "negativeCardData")
    public Object[][] negativeCardData() {

        return new Object[][] {

            // Blank card number
            {"Kumar", "456 Gandhi Road", "Chennai", "Tamil Nadu",
             "600001", "Visa", "", "11", "2029", "Kumar"},

            // Card number contains alphabets
            {"Kumar", "456 Gandhi Road", "Chennai", "Tamil Nadu",
             "600001", "Visa", "42222222bcd22222", "11", "2029", "Kumar"},

            // Blank name
            {"", "456 Gandhi Road", "Chennai", "Tamil Nadu",
             "600001", "Visa", "4012888888881881", "11", "2029", ""},

            // Name contains numbers
            {"Kumar123", "456 Gandhi Road", "Chennai", "Tamil Nadu",
             "600001", "Visa", "4012888888881881", "11", "2029", "Kumar123"}
        };
    }
    
    @Test(
    	    priority = 3,
    	    dataProvider = "negativeCardData",
    	    groups = {"negative"}
    	)
    
    	public void negativePurchaseFlight(
    	        String name,
    	        String address,
    	        String city,
    	        String state,
    	        String zipcode,
    	        String cardType,
    	        String cardNumber,
    	        String month,
    	        String year,
    	        String nameOnCard) {

    	    // Start from Home Page
    	    driver.get("https://blazedemo.com");

    	    // Search flight
    	    hp.selectDeparturecity("Boston");
    	    hp.selectDestinationcity("New York");
    	    hp.clickFindFlights();

    	    // Choose flight
    	    rp.verifychooseflight();

    	    // Passenger details
    	    cp.enterFirstname(name);
    	    cp.enterAddress(address);
    	    cp.enterCity(city);
    	    cp.enterState(state);
    	    cp.enterZipCode(zipcode);
    	    cp.selectCardType(cardType);

    	    // Card number validation
    	    if (cardNumber == null || cardNumber.trim().isEmpty()) {

    	        System.out.println("Negative test: Card number is blank");

    	        Assert.assertTrue(
    	            cardNumber == null || cardNumber.trim().isEmpty(),
    	            "Card number should be blank"
    	        );

    	        return;
    	    }

    	    if (!cardNumber.matches("\\d+")) {

    	        System.out.println(
    	            "Negative test passed: Card number contains non-numeric characters"
    	        );

    	        Assert.fail(
    	            "Application should reject non-numeric card number"
    	        );
    	    }

    	    // Name validation
    	    if (name == null || name.trim().isEmpty()) {

    	        System.out.println("Negative test: Name is blank");

    	        Assert.assertTrue(
    	            name == null || name.trim().isEmpty(),
    	            "Name should be blank"
    	        );

    	        return;
    	    }

    	    if (!name.matches("[a-zA-Z ]+")) {

    	        System.out.println(
    	            "Negative test: Name contains numbers/special characters"
    	        );

    	        Assert.fail(
    	            "Application should reject invalid name"
    	        );
    	    }

    	    cp.enterCreditCardNumber(cardNumber);
    	    cp.enterMonth(month);
    	    cp.enterYear(year);
    	    cp.enterNameOnCard(nameOnCard);

    	    cp.clickPurchaseFlight();
    }
    
    

 }

//
//
//
//
//
//
//
//
//
//
//
//
//
//
//














//package com.blazedemo.PageFactory.test;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.blazedemo.PageFactory.Base.BaseClass;
//
//public class FlightBookingTest extends BaseClass {
//
//    @Test(priority = 1)
//    public void verifytitle() {
//        hp.verifytitle();
//    }
//
//    @Test(priority = 2)
//    public void searchFlight() {
//
//        hp.selectDeparturecity("Boston");
//        hp.selectDestinationcity("New York");
//    }
//
//    @Test(priority = 3)
//    public void reserveflight() {
//
//        hp.clickFindFlights();
//    }
//
//    @Test(priority = 4)
//    public void purchaseflightticket() {
//
//        rp.verifychooseflight();
//    }
//
//
//    @DataProvider(name = "cardData")
//    public Object[][] cardData() {
//
//        return new Object[][] {
//
//            {"Mohan", "123 Main Road", "Coimbatore",
//             "Tamil Nadu", "641005",
//             "Visa", "4111111111111111", "10", "2028", "Mohan"},
//
//            {"Kumar", "456 Gandhi Road", "Chennai",
//             "Tamil Nadu", "600001",
//             "Visa", "4012888888881881", "11", "2029", "Kumar"},
//
//            {"Rahul", "789 MG Road", "Bangalore",
//             "Karnataka", "560001",
//             "Visa", "4222222222222222", "12", "2030", "Rahul"}
//        };
//    }
//
//
//    @Test(priority = 5, dataProvider = "cardData")
//    public void purchaseFlight(
//            String name,
//            String address,
//            String city,
//            String state,
//            String zipcode,
//            String cardType,
//            String cardNumber,
//            String month,
//            String year,
//            String nameOnCard) {
//
//
//        // Fill passenger details
//
//        cp.enterFirstname(name);
//
//        cp.enterAddress(address);
//
//        cp.enterCity(city);
//
//        cp.enterState(state);
//
//        cp.enterZipCode(zipcode);
//
//        cp.selectCardType(cardType);
//
//        cp.enterCreditCardNumber(cardNumber);
//
//        cp.enterMonth(month);
//
//        cp.enterYear(year);
//
//        cp.enterNameOnCard(nameOnCard);
//
//        cp.clickPurchaseFlight();
//    }
//}