import files.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {
	
	public static void main(String[] args) {
		
		JsonPath js=new JsonPath(payload.coursePrice());
		
		//1. Print No of courses returned by API
		
		int count= js.getInt("courses.size()");
		System.out.println(count);
		
		//2.Print Purchase Amount
		
		int totalAmount= js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//3. Print Title of the first course
		
		String titleFirstCourse= js.get("courses[0].title");
		System.out.println(titleFirstCourse);
		
		//4. Print All course titles and their respective Prices
		
		for (int i=0; i<count; i++)
		{
			System.out.println(js.get("courses["+i+"].title").toString());
			
			int prices= js.getInt("courses["+i+"].price");
			System.out.println(prices);
			
		// 5. Print no of copies sold by RPA Course
			
			
				String coursesTitles=js.get("courses["+i+"].title").toString();
				if (coursesTitles.equalsIgnoreCase("RPA"))
				{
					
					int copies= js.get("courses["+i+"].copies");
					System.out.println("No of Copies Sold "+copies);
					break;
					
				
				}
				}
				
			
			
			
		}
		
		
		
	

}
