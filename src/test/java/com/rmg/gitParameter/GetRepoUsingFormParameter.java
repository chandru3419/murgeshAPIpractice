package com.rmg.gitParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetRepoUsingFormParameter {
	
	@Test
	public void feedChicken(){
		
		//using param
		
		given()
			.param("client_id", "kgf1")
			.param("client_secret", "90c9415ae803c7854b0dd6ad1f6af992")
			.param("grant_type", "client_credentials")
		.when()
			.post("http://coop.apps.symfonycasts.com/token")
		.then()
			.log().all();
		
		
		
		//using form
//		given()
//			.formParam("client_id", "kgf1")
//			.formParam("client_secret", "90c9415ae803c7854b0dd6ad1f6af992")
//			.formParam("grant_type", "client_credentials")
//		.when()
//			.post("http://coop.apps.symfonycasts.com/token")
//		.then()
//			.log().all();
		
	
	}

}
