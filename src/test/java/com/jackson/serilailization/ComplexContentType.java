package com.jackson.serilailization;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class ComplexContentType {

	public static void main(String[] args) {
		
		Project pObj=new Project("mnb", "april", "Proj2Complex", "tyyt22", "ongoing",12); 
		
		given()
			.contentType(ContentType.JSON)
			.body(pObj)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.log().all();

	}

}
