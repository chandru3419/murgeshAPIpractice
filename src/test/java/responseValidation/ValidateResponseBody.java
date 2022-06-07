package responseValidation;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ValidateResponseBody {
	
	@Test
	public void validateBody(){
		
		given()
			.get("http://localhost:8084/projects")
		.then()
			.log().all()
			.and().body("[0].projectName", equalTo("MurgeshAPI"))
			.and().body("[0].createdBy", equalTo("murgesh"))
			.and().body("[1].projectId", containsString("4002"))
			.and().body("projectName", hasItems("MurgeshAPI","ResponseVerification1","ResponseVerification2"));
		
		
//		int i=5;
//		i++;
//		i=i++;
//		i=i + ++i;
//		System.out.println(--i);
		
		
//		
//		int[] a=new int[5];
//		a[0]=0;
//		a[1]=1;
//		
//		for (int i = 0; i < a.length-3; i++) {
//			a[i+2]=a[i+1]+a[i];
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		
//		double sum=0;
//		int i=0;
//		double term=1.0;
//		while(i<=10){
//			sum=sum+term;
//			term=0.25*term;
//			i++;
//		}
//		System.out.println(sum);
		
//		int i=1,j=1;
//		System.out.println("Tables");
//		while(i<=2){
//			while(j<=12){
//				System.out.println(i+"*"+j+"="+(i*j));
//				j++;
//			}
//			i++;
//			j=1;
//			System.out.println("");
//		}
		
//		for (int i = 1; i <=3; i++) {
//			for (int j = 1; j <=3; j++) {
//				for (int k = 1; k <=3; k++) {
//					System.out.println(k+" "+j+" "+i);
//				}
//			}
//		}
		
	}
}
