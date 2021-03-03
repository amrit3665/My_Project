import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;




public class Basics {

	public static void main(String[] args) {
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		String response= given().log().all().queryParam("key", "qaclick123").header("content-type","application/json")
		.body(payload.AddPlace()).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).
		header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String PlaceID=js.getString("place_id");
		System.out.println(PlaceID);
		
		// Update Place
		
		String newAddress= "Unit#32, 280 Pretoria Avenue, Randburg";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n" + 
				"\"place_id\":\""+PlaceID+"\",\r\n" + 
				"\"address\":\""+newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"").when().put("maps/api/place/update/json").then().assertThat().log().all().
		statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		// Get Place
		
		
		String getPlaceResponse=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", PlaceID).when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1= new JsonPath(getPlaceResponse);
		String actualAddress= js1.getString("address");
		System.out.println(actualAddress);
		
		Assert.assertEquals(actualAddress, newAddress);
		
		
		
		

	}

}
