package crudOopeTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjBDD {
	
	@Test
	public void deleteProj(){
		
		when()
			.delete("http://localhost:8084/projects/TY_PROJ_3802")
		.then()
			.log().all();
	}
}
