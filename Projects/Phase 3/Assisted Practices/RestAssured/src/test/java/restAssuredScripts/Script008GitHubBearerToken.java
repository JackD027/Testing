package restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script008GitHubBearerToken {

	@Test(priority = 1)
	public void authorisationBearerTocken() {
		
		Response res = RestAssured
						.given()
						.baseUri("https://api.github.com")
						.basePath("/user/repos")
						.headers("Authorization","Bearer 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")
						.when().get()
						.then()
						.extract().response();
		
		res.prettyPrint();
	}
	
	
	@Test(priority = 1)
	public void authorisationBearerTocken_SpecificRepo() {
		
		Response res = RestAssured
						.given()
						.baseUri("https://api.github.com")
						.basePath("/repos/JackD027/Testing")
						.headers("Authorization","Bearer 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")
						.when().get()
						.then()
						.extract().response();
		
		res.prettyPrint();
	}
	
}
