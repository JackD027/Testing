package restAssuredScripts;

import java.util.HashMap;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script003PostMethod {

	@Test
	public void PostMethod() {
	HashMap <String,String> map = new HashMap<String,String>();
	map.put("name","John");
	map.put("job","Tester");
	
	RestAssured.
	given().baseUri("https://reqres.in/") // url
	.basePath("/api/users") // request
	.contentType("application/json")  // what type of content body we are sending - JSON
	.body(map) // this is the body to be sent with post request
	.when().post()
	.then().statusCode(201).log().all();
	}
}
