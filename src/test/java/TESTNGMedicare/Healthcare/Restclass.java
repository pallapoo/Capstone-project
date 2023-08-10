package TESTNGMedicare.Healthcare;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Restclass{
	
	public static void main(String[] args) {
	
	RestAssured.baseURI="http://localhost:8081/medicare/show/all/products";
	
	String Response=given().log().all()
			.when().get()
			.then().statusCode(200).extract().response().asString();
	
	System.out.println(Response);
	System.out.println("Test case passsed successfully");
	
}
	
}