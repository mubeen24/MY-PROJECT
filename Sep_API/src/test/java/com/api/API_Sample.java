package com.api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Sample {
	

	@Test
	public void demo() {

		RestAssured.baseURI="https://www.instagram.com/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("accounts/emailsignup/");
		
		String statusLine = response.getStatusLine();	
		System.out.println(statusLine);
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Validation Successfully");
	}
	
}
