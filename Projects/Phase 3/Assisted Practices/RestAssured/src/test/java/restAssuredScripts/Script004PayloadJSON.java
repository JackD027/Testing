package restAssuredScripts;


import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.equalTo;

public class Script004PayloadJSON {

	@Test
	public void postUsingJSON() {
		
		JSONObject body = new JSONObject();
		
		body.put("name","SSSShubham");
		body.put("salary","1000");
		body.put("age", "23");
		
		RestAssured
		.given()
		.baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType("application/json")
		.body(body.toString())
		.when().post("/create")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	//use after disabling other 
	@Test
	public void postUsingJSON2() {
		
	JSONObject body = new JSONObject();
		
		body.put("name","SSSShubham");
		body.put("salary","1000");
		body.put("age", "23");
		
		int id = RestAssured
				.given()
				.baseUri("https://dummy.restapiexample.com")
				.basePath("/api/v1")
				.contentType("application/json")
				.body(body.toString())
				.when().post("/create")
				.then()
				.statusCode(200)
				.body("data.name",equalTo("SSSShubham"))
				.extract().path("data.id");
		
		
		System.out.println(id);
	}
	
}
