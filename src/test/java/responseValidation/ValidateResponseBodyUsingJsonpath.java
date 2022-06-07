package responseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class ValidateResponseBodyUsingJsonpath {
	
//	@Test
//	public void respBody(){
//		
//		Response resp = given()
//			.get("http://localhost:8084/projects");
//		
//		ArrayList<String> lst1 = resp.jsonPath().get("projectId");
//		ArrayList<String> lst2 = resp.jsonPath().get("projectName");
//		
//		for (int i = 0; i < lst1.size(); i++) {
//			System.out.println(lst1.get(i)+" ===> "+lst2.get(i));
//		}
//	}
	
	@Test
	public void withoutMatcher(){
		String exp="MurgeshAPI";
		boolean flag=false;
		Response resp2 = given()
			.get("http://localhost:8084/projects");
			
		ArrayList<String> lst3=resp2.jsonPath().get("projectName");
		
		for (int i = 0; i < lst3.size(); i++) {
			if(exp.equals(lst3.get(i))){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("Expected project name is present==> PASS");
		}else{
			System.out.println("Expected project name is not present==> FAIL");
		}
	}

}
