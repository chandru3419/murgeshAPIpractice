package requestChaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {
	
//	@Test
	public void timeValidation(){
		
		given()
			.get("http://localhost:8084/projects")
		.then()
			.log().all()
			.assertThat().time(Matchers.lessThan(5l), TimeUnit.SECONDS);
	}
	
	@Test
	public void other(){
		long time = given()
			.get("http://localhost:8084/projects")
			.timeIn(TimeUnit.MILLISECONDS);
		
		System.out.println(time);
	}

}
