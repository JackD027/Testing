package restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script010SSLAuthentication {
	
	@Test
	public void SSL_authentication()
	{
		RestAssured.given().relaxedHTTPSValidation()
		.when().get("https://testautomasi.com/Home/").then().log().all();
		
	}

}
