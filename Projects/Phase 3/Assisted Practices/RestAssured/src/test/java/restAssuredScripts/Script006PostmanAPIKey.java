package restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script006PostmanAPIKey {

	
	@Test(priority = 1)
	public void postmanGetReq01() {
	
		RestAssured
		.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.headers("X-Api-Key","")
		.when().get()
		.then()
		.statusCode(200);
	}



	
	@Test(priority = 2)
	public void postmanGetReq02() {
	
		String name = RestAssured
						.given()
						.baseUri("https://api.postman.com")
						.basePath("/workspaces")
						.headers("X-Api-Key","")
						.when().get()
						.then()
						.extract().path("workspaces[1].name");
		
		System.out.println(name);
	}
	
	
	@Test(priority = 3)
	public void postmanGetReq03() {
	
		Response res = RestAssured
						.given()
						.baseUri("https://api.postman.com")
						.basePath("/workspaces")
						.headers("X-Api-Key","")
						.when().get()
						.then()
						.extract().response();
		
		JsonPath json = new JsonPath(res.asString());
		
		System.out.println(json.getString("workspaces[1]"));
	}

}
