package RestAssuredAPI;

import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VaultServices {
	
	//@Test
	void GetRefKeyByUID() {
		
		//Specify base URI
		
		RestAssured.baseURI="https://kioskiat.sbiuat.bank.in";
		
		RequestSpecification request= RestAssured.given() ;
		request.header("Content-Type", "application/json");
		
		String requestbody ="{\r\n"
				+ "    \"Message\": {\r\n"
				+ "        \"messageId\": \"276588746784SBIFA23276170213481157888\",\r\n"
				+ "        \"originalMessageId\": \"45345465745654565454\",\r\n"
				+ "        \"msgType\": \"json\",\r\n"
				+ "        \"dateTime\": \"2023-08-04 07:37:26.812\"\r\n"
				+ "    },\r\n"
				+ "    \"TxnMeta\": {\r\n"
				+ "        \"accode\": \"ERefKey\",\r\n"
				+ "        \"code\": \"ERefKey\",\r\n"
				+ "        \"subcode\": \"ENQ\",\r\n"
				+ "        \"id\": \"565879787778778777589647\",\r\n"
				+ "        \"msgId\": \"873687678\"\r\n"
				+ "    },\r\n"
				+ "    \"Remtr\": {\r\n"
				+ "        \"type\": \"IND\",\r\n"
				+ "        \"Pid\": {\r\n"
				+ "            \"type\": \"AADHAAR\",\r\n"
				+ "            \"Detail\": [\r\n"
				+ "                {\r\n"
				+ "                    \"name\": \"AADHAAR\",\r\n"
				+ "                    \"value\": \"731817444183\"\r\n"
				+ "                }\r\n"
				+ "            ]\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "";
		
		 request.body(requestbody);
		
		Response response = request.request(Method.POST, "/lmgsvc/EIS/GetRefKeyByUID");
		
		System.out.println("Response Body: ");
        System.out.println(response.getBody().asString());
        
       String VaultID = response.jsonPath().getString("Remtr.AcInfo.VLTID");
       System.out.println(VaultID);
       
   
		
	}
	
	@Test
	void refkey() {
		
		Response response =
		        RestAssured
		                .given()
		                .header("Content-Type", "application/json")
		                .when()
		                .post("https://kioskiat.sbiuat.bank.in/MasterData/master/CITY_MASTER");

		System.out.println(response.asString());
	}

}
