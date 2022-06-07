package com.rmg.gitParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetRepoUsingPathTest {
	
	@Test
	public void getSingleRepo(){
		
		given()
			.auth().basic("murgeshnb", "Mn@9902115140")
			.pathParam("ownerName", "murgeshnb")
			.pathParam("repoName", "newstart")
		.when()
			.get("https://api.github.com/repos/{ownerName}/{repoName}")
		.then()
			.log().all();
	}

}
