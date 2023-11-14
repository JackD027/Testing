package steps;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class githubSteps {
	
	Response res;
	
	@Given("User Enters GitHub base URL and Authorization")
	public void user_enters_git_hub_base_url_and_authorization() {
		given()
		.baseUri("https://api.github.com")
		.basePath("/user/repos")
		.headers("Authorization","Bearer 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");
	}

	@When("User executes HTTP get method")
	public void user_executes_http_get_method() {
		res = given()
			  .baseUri("https://api.github.com")
			  .basePath("/user/repos")
			  .headers("Authorization","Bearer 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")
			  .when().get();
	}

	@Then("Validate the response status code")
	public void validate_the_response_status_code() {

		res.prettyPrint();
		Assert.assertEquals(res.statusCode(),200);
	}
}
