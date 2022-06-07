package com.rmg.gitParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetRepoUsingQueryParameterTest {
	
	@Test
	public void getOneRepo(){
		
		
		//using param
		given()
			.param("q", "newstart")
			.param("sort", "updated")
		.when()
			.get("https://api.github.com/search/repositories")
		.then()
			.log().all();
			
		
//		using querypa
//		given()
//			.auth().basic("murgeshnb", "Mn@9902115140")
//			.queryParam("q", "newstart")
//			.queryParam("sort", "updated")
//		.when()
//			.get("https://api.github.com/search/repositories")
//		.then()
//			.log().all();
		
	}

}
