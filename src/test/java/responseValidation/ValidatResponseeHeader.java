package responseValidation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ValidatResponseeHeader {
	
	@Test
	public void validateHeaderTest(){
		
		given()
			.get("http://localhost:8084/projects")
		.then()
			.log().all()
			.assertThat().statusCode(200)
			.and()
			.contentType(ContentType.JSON)
			.and()
			.assertThat().header("Content-Type", "application/json")
			.assertThat().header("Transfer-Encoding", "chunked");
	}

}
