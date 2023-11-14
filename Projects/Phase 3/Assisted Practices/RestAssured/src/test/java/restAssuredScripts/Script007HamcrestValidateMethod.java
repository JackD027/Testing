package restAssuredScripts;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class Script007HamcrestValidateMethod {
	
	@Test(priority = 1)
	public void validateResponseBody() {
		String PMapikey = "PMAK-6544af87e18af40a1c36eec7-d9078045d974c73812c994a13777928346";

		RestAssured
		.given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		// fetch the response body and validate if response includes correct values or not
		.body("workspaces[1].id", equalTo("e364321f-f592-470e-a112-0f4c6da76fb8"),
			  "workspaces[1].name",equalTo("Phase-3"),
			   "workspaces[1].type",equalTo("personal"));	
	}
	
	@Test(priority='2')
	public void ValidateResponseBody_equalTo()
	{
		RestAssured
		.given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		.body("username", equalTo("Uname001"),
			  "email", equalTo("Positive@Attitude.com"),
			  "userStatus", equalTo(1));
	}
	
	
	@Test(priority='3')
	public void ValidateResponseBody_hasitems()
	{
		String PMapikey = "PMAK-6544af87e18af40a1c36eec7-d9078045d974c73812c994a13777928346";
		RestAssured
		.given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		.body("workspaces.name", hasItems("Phase-3","Phase-3-Automation"),
				"workspaces.type", hasItems("personal"));		
	}

}
