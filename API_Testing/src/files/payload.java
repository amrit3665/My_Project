package files;

public class payload {
	
	public static String AddPlace() {
		
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Amrit Rai\",\r\n" + 
				"  \"phone_number\": \"(+27) 63424001 000\",\r\n" + 
				"  \"address\": \"29, Forest Place, Randburg 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"86, Tulsi Nagar\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://amazon.com\",\r\n" + 
				"  \"language\": \"Zulu-IN\"\r\n" + 
				"}\r\n" + 
				"";
	}
	
	public static String coursePrice() {
		
		return "{\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\"purchaseAmount\": 1010,\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"},\r\n" + 
				"\"courses\": [\r\n" + 
				"{\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\"price\": 50,\r\n" + 
				"\"copies\": 6\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\"price\": 40,\r\n" + 
				"\"copies\": 4\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\"price\": 45,\r\n" + 
				"\"copies\": 10\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"Java\",\r\n" + 
				"\"price\": 10,\r\n" + 
				"\"copies\": 10\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"]\r\n" + 
				"}\r\n" + 
				"";
		
	}

}
