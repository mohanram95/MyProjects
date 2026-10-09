package com.APItesting.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class APITest 
{
	
	 String token1;
	 String id;
	 String email = "ravins"+System.currentTimeMillis()+"@gmail.com";
	 
  @Test(priority=1)
  public void PostreqtoAddNewUser()
  {
	
	  
	  String email = "ravins"+System.currentTimeMillis()+"@gmail.com";
	  	
	  HashMap<String,Object> data= new HashMap<String,Object>();
	  data.put("firstName", "ragul");
	  data.put("lastName", "ravi");
	  data.put("email", email);
	  data.put("password", "myPassword");
	  
	Response response=  given().
	  header("Content-type","application/json").
	  body(data).
	  when().
	  post("https://thinking-tester-contact-list.herokuapp.com/users");
	  System.out.println("The Response is:"+response.statusCode());
	  
	response.then().log().body();
	
	  Assert.assertEquals(response.statusCode(),201);
	 System.out.println("Successfully created new user");
	 
	  
	token1=  response.jsonPath().getString("token");
	 System.out.println(token1);
	  
  }
  @Test(priority=2)
  public void getuserprofile()
  {
	  
	  Response response=given().
	  header("Authorization", "Bearer "+token1).
	  when().
	  get("https://thinking-tester-contact-list.herokuapp.com/users/me");
	  System.out.println("The Response is:"+response.statusCode());
	  response.then().log().body();
	  
	  Assert.assertEquals(response.statusCode(), 200);
	  System.out.println("Successfully retrived the user profile");
	  
	  
  }
  @Test(priority=3)
  public void UpdateUser()
  {
	  
	  
	  HashMap<String,Object> data1= new HashMap<String,Object>();
	  
	  data1.put("firstName","ragul");
	  data1.put("lastName", "ravi");
	  data1.put("email", email);
	  data1.put("password", "mynewPassword");
	  
	 Response response= given().
	  header("authorization","Bearer "+token1).
	  header("Content-type","application/json").
	  body(data1).
	  when().
	  patch("https://thinking-tester-contact-list.herokuapp.com/users/me");
	 System.out.println("The Response is:"+response.statusCode());
	  
	 response.then().log().body();
	Assert.assertEquals(response.statusCode(),200);
	System.out.println("successfully updated user");
  }
  
  @Test(priority=4)
  public void LoginUser()
  {
	  HashMap<String,Object> data2= new HashMap<String,Object>();
	  
	  data2.put("email",email);
	  data2.put("password", "mynewPassword");
	  
	Response response=  given().
	  header("authorization","Bearer "+token1).
	  header("Content-type","application/json").
	  body(data2).
	  when().
	  post("https://thinking-tester-contact-list.herokuapp.com/users/login");
	System.out.println("The Response is:"+response.statusCode());
	  response.then().log().body();
	  
	  
	  Assert.assertEquals(response.statusCode(),200);
	  System.out.println("successfully loged in user");
	  
  }
  
  @Test(priority=5)
  
  public void AddUser()
  {
	  
	  HashMap<String,Object> data3= new HashMap<String,Object>();
	  
	  data3.put("firstName", "John");
	  data3.put("lastName", "Doe");
	  data3.put("birthdate", "1970-01-01");
	  data3.put("email", "jdoe@fake.com");
	  data3.put("phone", "8005555555");
	  data3.put("street1", "1 Main St");
	  data3.put("street2","Apartment A");
	  data3.put("city", "Anytown");
	  data3.put("stateProvince", "KS");
	  data3.put("postalcode","12345");
	  data3.put("country", "USA");
	  
	  Response response=   given().
	  header("authorization","Bearer "+token1).
	  header("Content-type","application/json").
	  body(data3).
	  when().
	  post(" https://thinking-tester-contact-list.herokuapp.com/contacts");
	  
	  System.out.println("The Response is:"+response.statusCode());
	  response.then().log().body();
	  
	  id=response.jsonPath().getString("_id");
	  
	  Assert.assertEquals(response.statusCode(), 201);
	  System.out.println("Successfully added new contact");
	  
	  
	  
  }
  
  @Test(priority=6)
  
  public void GetContactList()
  {
	
	  
	 Response response= given().
	  header("authorization","Bearer "+token1).
	  header("Content-type","application/json").
	  when().
	  get(" https://thinking-tester-contact-list.herokuapp.com/contacts");
	  
	 System.out.println("The Response is:"+response.statusCode());
	  response.then().log().body();
	  
	  Assert.assertEquals(response.statusCode(),200);
	  
	  System.out.println("Successfully retrived the contact list");
	  
	  
	  
  }
  
@Test(priority=7)

public void GetContact()
{
	
	Response response= given().
			    header("authorization","Bearer "+token1).
			    header("Content-type","application/json").
			    when().
			    get(" https://thinking-tester-contact-list.herokuapp.com/contacts/");
	System.out.println("The Response is:"+response.statusCode());
			
	response.then().log().body();
	Assert.assertEquals(response.statusCode(),200);
	System.out.println("Successfully retrived the contact");
}
  
  @Test(priority=8)
  public void UpdateContact()
  { 
	  HashMap<String,Object> data4= new HashMap<String,Object>();
	  
	  data4.put("firstName", "Amy");
	  data4.put("lastName", "Miller");
	  data4.put("birthdate", "1992-02-02");
	  data4.put("email", "amiller@fake.com");
	  data4.put("phone", "8005554242");
	  data4.put("street1", "13 School St.");
	  data4.put("street2","Apt. 5");
	  data4.put("city", "Washington");
	  data4.put("stateProvince", "QC");
	  data4.put("postalcode","A1A1A1");
	  data4.put("country", "Canada");
	  
	  
	  Response response= given().
			  header("authorization","Bearer "+token1).
			  header("Content-type","application/json").
			  body(data4).
			  when().
			  put(" https://thinking-tester-contact-list.herokuapp.com/contacts/"+id);
	  System.out.println("The Response is:"+response.statusCode());
	  response.then().log().body();
	  Assert.assertEquals(response.statusCode(),200);
	System.out.println("Successfully updated the contact");
	
	}
  
  @Test(priority=9)
  
  public void UpdateContactpatch()
  {
	  
	  HashMap<String,Object> data5= new LinkedHashMap<String,Object>();
	  
	  data5.put("firstname","Mohan");
	  data5.put("Latname","Murugesan");
	  
	  
	 Response response= given().
	  header("authorization","Bearer "+token1).
	  header("Content-type","application/json").
	  body(data5).
	  when().
	  patch("https://thinking-tester-contact-list.herokuapp.com/contacts/"+id);
	 
	 System.out.println("The Response is:"+response.statusCode());
	  
	  response.then().log().body();
	  Assert.assertEquals(response.statusCode(),200);
	  
	  System.out.println("Successfully update the name");
	  
	  
 }
  
  
  @Test(priority=10)
  public void LogoutUser()
  {
	  
	  
	         Response response= given().
	        		 header("authorization","Bearer "+token1).
	        		 header("Content-Type","application/json").
	        		 when().
	        		 post("https://thinking-tester-contact-list.herokuapp.com/users/logout");
	        		 
	         System.out.println("The response is:"+ response.statusCode());
	         
	         
	         response.then().log().body();
	         
	         Assert.assertEquals(response.statusCode(), 200);
	         
	         System.out.println("Successfully logout");
  }
  
}
