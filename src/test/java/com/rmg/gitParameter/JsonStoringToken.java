package com.rmg.gitParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class JsonStoringToken {
	
	@Test
	public void jsonStore(){
		String accessToken = given()
			.formParam("client_id", "kgf1")
			.formParam("client_secret", "90c9415ae803c7854b0dd6ad1f6af992")
			.formParam("grant_type", "client_credentials")
		.when()
			.post("http://coop.apps.symfonycasts.com/token")
			.jsonPath().get("access_token");
		
		System.out.println(accessToken);
		
		given()
			.auth().oauth2(accessToken)
			.post("http://coop.apps.symfonycasts.com/api/3140/chickens-feed")
			.then().log().all();
	}

}
