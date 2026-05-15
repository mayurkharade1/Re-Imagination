package RestAssuredAPI.RestAssuredAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MasterData {
	
	@Test
	void CityMaster() {
		
		//Specify base URI
		
		RestAssured.baseURI="https://kioskiat.sbiuat.bank.in/MasterData/master";
		
		RequestSpecification request= RestAssured.given() ;
		
		Response response = request.request(Method.POST,"/BIN_MASTER");
		
		String res=response.getBody().asString();
		int stscode = response.getStatusCode();
		
		System.out.println("Status Code " +stscode);
		System.out.println("Response " +res);
		
		Assert.assertEquals(stscode, 200);
		
		String stsLine= response.getStatusLine();
		
		System.out.println("Status Line  " +stsLine);
		Assert.assertEquals(stsLine, "HTTP/1.1 200 ");
		
		
	}

}
