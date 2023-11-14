package CourseEnd;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Assignment004Demo {
	
	@Test
	public void assignment004login()
	{
		RestAssured.given()
					.baseUri("https://petstore.swagger.io/v2/user/login")
					.auth().preemptive().basic("Uname001", "@tt!tude")
					.when()
					.get()
					.then()
					.statusCode(200)
					.log().all()
					.body("message", Matchers.anything());
	}

}