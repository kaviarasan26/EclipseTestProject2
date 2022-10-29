import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;

public class Test_POST {

	@Test
	public void test1_Post() {
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
post("https://reqres.in/api/users").
then().
statusCode(201);
	}
}
