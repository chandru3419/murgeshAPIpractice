package crudOopeTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject_WithoutBDD {
	
	@Test
	public void createProjects(){
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("createdBy", "mnb");
		jsonobj.put("createdOn", "april-25");
		jsonobj.put("ProjectName", "Doosra");
		jsonobj.put("ProjectId", "ty0012");
		jsonobj.put("status", "ongoing");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		
		Response resp = req.post("http://localhost:8084/addProject");	
		resp.then().log().all();	
	}

}
