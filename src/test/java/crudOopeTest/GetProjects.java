package crudOopeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProjects {

	@Test
	public void getAllProjects(){
		/**
		 * get all projects
		 * URI : http://localhost:8084/projects
		 */
		
		Response resp = RestAssured.get("http://localhost:8084/projects");
		System.out.println(resp.getStatusCode());
		
		Assert.assertEquals(200, resp.getStatusCode());
		
		//get the content type
		System.out.println(resp.getContentType());
		
		ValidatableResponse resVal = resp.then();
		resVal.log().all();
	}

}
