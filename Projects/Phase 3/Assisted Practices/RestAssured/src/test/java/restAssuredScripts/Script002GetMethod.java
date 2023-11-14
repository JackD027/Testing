package restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script002GetMethod {
	@Test
	public void GetmethodBDDStyle() {
		// Method Chaining concept for api testing

		// output of method is an input to another method

		// driver.manage().window().maxamize();
		// driver.manage().timeouts().implicitlywait();

		RestAssured.given()
				  	.baseUri("https://reqres.in/api/users")
					.queryParam("page", "2")
					.when().get()
					.then()
					.statusCode(200) // this method validate if the response status code is 200 or not
					.log().all(); // fetch the response and print it on console
	}

}
