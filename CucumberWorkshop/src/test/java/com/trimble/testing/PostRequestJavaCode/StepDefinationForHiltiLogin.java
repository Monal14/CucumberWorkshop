package com.trimble.testing.PostRequestJavaCode;

import static org.hamcrest.Matchers.notNullValue;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StepDefinationForHiltiLogin {
Response response;
	@Given("^user hit the post request from String for Hilti$")
	public void user_hit_the_post_request_from_String_for_Hilti() throws Throwable {
		response = RestAssured.given().
				header("Authorization", "Basic ZmZhXzNFcXN5dXoyeEVvR1ROampOMmJ6ZWJ3YTpYVnJ0ZkJYVHl6Z3FMRWlNeGV6aTBTRVFuTUFh").
				header("Content-Type", "application/x-www-form-urlencoded").
				header("app_id", "3b5d1b86").
				header("Accept", "application/json").
				header("Connection", "keep-alive").
				when().queryParam("grant_type", "password").
				queryParam("scope", "PRODUCTION").
				queryParam("username", "monal@samtani.com").
				queryParam("password", "hilti123").
				//body("{\"grant_type\":\"password\",\"scope\":\"PRODUCTION\" , \"username\":\"monal@samtani.com\" , \"password\":\"hilti123\"}")
				post("https://puneqa.ictoncloud.in/token");
		response.then().log().all();
		response.then().log().status();
		System.out.println("====="+response.asString());
	}

	@Then("^user validate the access_token is not null$")
	public void user_validate_the_token_is_not_null() throws Throwable {
		//response.then().assertThat().body("access_token", notNullValue());
		
		//check id is greater than zero
		String access_token = response.getBody().jsonPath().get("access_token");
	
	//	Assert.assertTrue(idInt > 0);
		System.out.println(access_token);
		
	}


}
