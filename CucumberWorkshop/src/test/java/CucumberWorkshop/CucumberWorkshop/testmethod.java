/*package CucumberWorkshop.CucumberWorkshop;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testmethod {
	Response response;
	@Given("launching Google")
	public void launching_Google() {
		System.out.println("Hi");
		response=RestAssured.given().
		when().
		get("http://www.google.com");
		int i=response.statusCode();
		System.out.println("Code : "+i);
	}
	
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
		response=RestAssured.given().
				when().
				get("http://www.google.com");
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	   
	}

	@Given("^user checks (\\d+) the status code$")
	public void user_checks_the_status_code(int expectedStatusCode) throws Throwable {
		int actualStatusCode=response.statusCode();
		Assert.assertTrue(expectedStatusCode== actualStatusCode);
		System.out.println("Code : "+actualStatusCode);
	}

	@Then("^user checks the count or size$")
	public void user_checks_the_count_or_size() throws Throwable {
	  
	}

	@Then("^user checks \"([^\"]*)\" value$")
	public void user_checks_value(String arg1) throws Throwable {
	    
	}

	@Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
	public void user_checks_at_path_with_the_value(String arg1, String arg2) throws Throwable {
	   
	}
}
*/