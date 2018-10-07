package com.trimble.testing.PostRequestJavaCode;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class StepDefinationForPostRequest {
	Response response;
	@Given("^user hit the post request from String$")
	public void user_hit_the_post_request_from_String() throws Throwable {
		response = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body("{    \"name\": \"Tom\",    \"job\":\"Actor\"}").post("https://reqres.in/api/users");
		response.then().log().all();
		response.then().log().status();
		System.out.println("====="+response.asString());
	}

	@Then("^user validate the id is not null$")
	public void user_validate_the_id_is_not_null() throws Throwable {
		//Check id is not null
		response.then().assertThat().body("id", notNullValue());
				
				//check id is greater than zero
				String idValue = response.getBody().jsonPath().get("id");
				int idInt = Integer.parseInt(idValue);
				Assert.assertTrue(idInt > 0);
	}

}
