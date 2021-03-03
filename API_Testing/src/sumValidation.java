import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class sumValidation {

	public static void main(String[] args) {
		

		JsonPath js=new JsonPath(payload.coursePrice());
	int count= js.getInt("courses.size()");
	
	int sum=0;
	
	for(int i=0; i<count; i++)
	{
		
		int price= js.get("courses["+i+"].price");
		int copies= js.get("courses["+i+"].copies");
		int amount= price*copies;
		//System.out.println(amount);
		
		sum = sum+amount;		
	}
	System.out.println(sum);
	
	int purchaseAmount= js.getInt("dashboard.purchaseAmount");
	
	 Assert.assertEquals(purchaseAmount, sum);

}
}
