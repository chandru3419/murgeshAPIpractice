package com.jackson.serilailization;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ComplexHashMap {

	public static void main(String[] args) {
		
		Map<String, Object> map=new HashMap<String, Object>();
		
		map.put("projecctName", "ProjHashMAp");
		map.put("projectId", "Tyss002");
		map.put("Status", "ongoing");
		map.put("teamSize", 12);
		map.put("createdBy", "MNB");
		map.put("createdOn", "april");
		
		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.log().all();
	}

}
