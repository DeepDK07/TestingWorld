package Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Get_Method {
	
	@Test
	public void Get_method_User() {
		RestAssured.baseURI= "https://reqres.in";
		Response response= given()
				.when()
				.get("/api/users/2")
				.then()
				.extract()
				.response();
				
		System.out.println(response);
		
		String stringResponse = response.asPrettyString();
		
		System.out.println(stringResponse);
	}

}
