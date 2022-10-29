import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {

	@Test
	public void test_01() {
		// TODO Auto-generated method stub
Response response=RestAssured.get("https://reqres.in/api/users?page=2");
System.out.println(response.asString());
System.out.println(response.getBody());
System.out.println(response.getStatusCode());
System.out.println(response.getStatusLine());
System.out.println(response.getTime());

int statuscode=response.getStatusCode();
Assert.assertEquals(statuscode, 200);
	}
}
