package crudOopeTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllprojects_BDD {
	
	@Test
	public void getAllprojects(){
		
		when()
			.get("http://localhost:8084/projects")
		.then()
			.log().all()
			.assertThat().statusCode(200)
			.and()
			.assertThat().contentType(ContentType.JSON);
	}

}
