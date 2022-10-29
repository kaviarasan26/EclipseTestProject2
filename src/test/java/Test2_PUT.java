import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Test2_PUT {

	@Test
	public void test1_Put() {
		// TODO Auto-generated method stub
Map<String, Object> map=new HashMap<String, Object>();
map.put("name", "kaviarasan");
map.put("job", "Tester");

System.out.println(map);

JSONObject request =new JSONObject(map);

System.out.println(request);
System.out.println(request.toJSONString());

given().

body(request.toJSONString()).
when().
put("https://reqres.in/api/users/2"). //same for patch  
then().
statusCode(200). 
log().all();
	}
}
