package TESTNGMedicare.Healthcare;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import io.restassured.RestAssured;

public class Restclass1{
	
	public static void main(String[] args) throws InterruptedException {
	
	RestAssured.baseURI="http://localhost:8081/medicare/show/category/2/products";
	
	String Response=given().log().all()
			.when().get()
			.then().statusCode(200).extract().response().asString();
	
	System.out.println(Response);
	System.out.println("Test case passsed successfully");
	
	assertTrue(Response.contains("Analgesics"), "Response does not contain 'analgesics'");
	
}
	
}