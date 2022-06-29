package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestExample {
	@Test
	public void test_1() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		
	
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getHeader("content-type"));
		System.out.println(res.getTime());
		int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode, 201);
	}
	//@Test
		void test_02() {
			
			given()
				.get("https://reqres.in/api/users?page=2")
			.then()
				.statusCode(200)
				.body("data.id[0]", equalTo(9));
		}

}
