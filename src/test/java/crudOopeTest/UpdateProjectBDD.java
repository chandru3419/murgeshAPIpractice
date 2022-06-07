package crudOopeTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectBDD {
	
	@Test
	public void updateProj(){
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("projectName", "BDD");
		
		given()
			.contentType(ContentType.JSON)
			.body(jsonobj.toJSONString())
		.when()
			.put("http://localhost:8084/projects/TY_PROJ_4002")
		.then()
			.log().all();
	}

}
