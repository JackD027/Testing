package restAssuredScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script001SetUpCheck {

	@Test
	public void setUp() {

		// Response res = RestAssured.get("https://reqres.in/api/users/2");
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		System.out.println(res.time());

		System.out.println(res.getBody().asString());

		int expectedStatusCode = 200;
		int actualStatusCode = res.getStatusCode();

		Assert.assertEquals(expectedStatusCode, actualStatusCode);
	}

	
}
