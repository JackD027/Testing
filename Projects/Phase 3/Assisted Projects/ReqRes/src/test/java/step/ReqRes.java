package step;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ReqRes {
	@Given("User sends a Post request to create a user and validate response status")
	public void user_sends_a_post_request_to_create_a_user_and_validate_response_status() {
		JSONObject body = new JSONObject();
		body.put("name", "Aman Singh");
		body.put("job", "Java Developer");

		RestAssured.given()
					.baseUri("https://reqres.in")
					.basePath("/api/users")
					.contentType("application/json")
					.body(body.toString())
					.when().post()
					.then().statusCode(201)
					.log().all(); 

	}

	@Given("User sends a Get request to get a user and validate response status")
	public void user_sends_a_get_request_to_get_a_user_and_validate_response_status() {

		JSONObject body = new JSONObject();
		body.put("email", "janet.weaver@reqres.in");
		body.put("password", "Avsr@$1");
		
		RestAssured.given() 
					.baseUri("https://reqres.in")
					.contentType(ContentType.JSON)
					.body(body.toString())
					.when().post("/api/register")
					.then().statusCode(200)
					.log().all();
	}

	@Given("User sends a get request to get list of users and validate response status")
	public void user_sends_a_get_request_to_get_list_of_users_and_validate_response_status() {
		RestAssured.given()
					.baseUri("https://reqres.in")
					.basePath("/api/unknown")
					.when().get()
					.then().statusCode(200)
					.log().all();
	}

}
