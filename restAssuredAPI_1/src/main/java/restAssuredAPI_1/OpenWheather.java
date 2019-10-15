package restAssuredAPI_1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OpenWheather {
	@Test
	public void testresponseCode()
	{
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int statusCode = resp.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
	}

}
