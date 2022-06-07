package crudOopeTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject_BDD {
	
	@Test
	public void createProj(){
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("projectName", "CreatedBDD");
		jsonobj.put("CreatedBy", "MB!");
		jsonobj.put("status", "completed");
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonobj.toJSONString())
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.log().all();
	}

}
