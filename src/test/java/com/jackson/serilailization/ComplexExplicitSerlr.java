package com.jackson.serilailization;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

public class ComplexExplicitSerlr {

	public static void main(String[] args) {
		
		Project pObj=new Project("mnb2", "april", "DoosraExplicit", "ExpSerlr", "ongoing", 12);
		
		given()
			.contentType(ContentType.JSON)
			.body(pObj,ObjectMapperType.JACKSON_1)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.log().all();
	
	}

}
