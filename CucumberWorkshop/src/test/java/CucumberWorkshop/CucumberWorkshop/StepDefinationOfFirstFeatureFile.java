package CucumberWorkshop.CucumberWorkshop;

import org.junit.Assert;
import static org.hamcrest.Matchers.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class StepDefinationOfFirstFeatureFile {
	Response response;

	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {

	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
		// Response resp =
		response = RestAssured.given().relaxedHTTPSValidation().when()
				.get("https://ergast.com/api/f1/2017/circuits.json");

		// print response in string
		String respString = response.asString();
		System.out.println(respString);

		// get all headers
		Headers heds = response.getHeaders();
		System.out.println(heds);

	}

	@Then("^user checks the count or size$")
	public void user_checks_the_count_or_size() throws Throwable {
		response.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
		
		String limitValue = response.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitValue);	
		
		//verify the size
		response.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
		
		
	}

	@Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
	public void user_checks_at_path_with_the_value(String arg1, String arg2) throws Throwable {
		String actualCircuitValue = response.getBody().jsonPath().getString(arg1);
		Assert.assertEquals(arg2, actualCircuitValue);
	}
}