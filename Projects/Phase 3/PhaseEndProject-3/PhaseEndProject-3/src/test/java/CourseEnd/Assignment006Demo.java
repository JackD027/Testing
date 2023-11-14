package CourseEnd;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Assignment006Demo {

	@Test
	public void assignment006Logout()
	{
		RestAssured.given()
					.baseUri("https://petstore.swagger.io/v2/user/logout")
					.when()
					.get()
					.then()
					.statusCode(200)
					.log().all()
					.body("code", Matchers.equalTo(200))
					.body("type", Matchers.equalTo("unknown"))
					.body("message", Matchers.equalTo("ok"));
	}
}