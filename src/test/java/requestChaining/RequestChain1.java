package requestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class RequestChain1 {
	
//	@Test
	public void requestProjectNAme(){
		Response resp = given()
			.get("http://localhost:8084/projects");
		
		String firstProjectID = resp.jsonPath().get("[0].projectId");
		
		given()
			.pathParam("fid", firstProjectID)
			.get("http://localhost:8084/projects/{fid}")
		.then()
			.log().all();
	}
	
	@Test
	public void propertyAllProjects(){
		Response resp = given()
			.get("http://localhost:8084/projects");
		
		ArrayList<String> lst=resp.jsonPath().get("projectId");
		
		for(int i=0;i<lst.size();i++)
		{
			given()
			.pathParam("fid", lst.get(i))
				.get("http://localhost:8084/projects/{fid}")
			.then()
				.log().all();
		}
	}

}
