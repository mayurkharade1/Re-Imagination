package RestAssuredAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Precheck {
	
	
	@Test
	void dedupeOnId() {
		
		RestAssured.baseURI="https://kioskiat.sbiuat.bank.in";
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		String reqbody= "{\r\n"
				+ "  \"Message\": {\r\n"
				+ "      \"messageId\": \"276588746784SBIFA23276170213481157896\",\r\n"
				+ "      \"originalMessageId\": \"{{msgId}}\",\r\n"
				+ "      \"msgType\": \"json\",\r\n"
				+ "      \"dateTime\": \"2026-15-05 11:07:26.256\"\r\n"
				+ "  },\r\n"
				+ "  \"TxnMeta\": {\r\n"
				+ "      \"accode\": \"DedupeonID\",\r\n"
				+ "      \"code\": \"DedupeonID\",\r\n"
				+ "      \"subcode\": \"precheck\",\r\n"
				+ "      \"id\": \"456565656565656565656565656556\",\r\n"
				+ "      \"msgId\": \"521266563565236\"\r\n"
				+ "  },\r\n"
				+ "  \"User\": {\r\n"
				+ "    \"branch\":\"00437\"\r\n"
				+ "    },\r\n"
				+ "    \"IdDetails\":[\r\n"
				+ "        {\r\n"
				+ "        \"name\":\"Aadhaar with Same Address\",\r\n"
				+ "        \"value\":\"25j0lVuoOlV3\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
		request.body(reqbody);
		
		  Response response = request.request(Method.POST, "/lmgsvc/EIS/Ft_dedupID_ENC");
		  
		  String ResponseBody=response.getBody().asString();
		  
		  //System.out.println(ResponseBody);

		 int sts= response.getStatusCode();
		 
		 String msg = response.jsonPath().getString("TxnResp.msg");
		 String cif = response.jsonPath().getString("ServiceInfo.customer.xcifno");
		 System.out.println(msg +" - "+cif);
		String hdr= response.getHeader("Date");
		 System.out.println(hdr);
		 Assert.assertEquals(sts, 200);
		 
	}
	
	@Test
	void amlockSearch() {
		
		Response response = RestAssured.given()
						.header("Content-Type", "application/json")
						.body("{\r\n"
								+ "  \"TxnMeta\" : {\r\n"
								+ "    \"accode\" : \"AMLOCKSCREENMATCH\",\r\n"
								+ "    \"code\" : \"AMLOCKSCREENMATCH\",\r\n"
								+ "    \"subcode\" : \"AMLOCK\",\r\n"
								+ "    \"id\" : \"WEB5-6827-4dab-9956-2d2d8611fd4a\",\r\n"
								+ "    \"msgId\" : \"859632145021578\"\r\n"
								+ "  },\r\n"
								+ "  \"Message\" : {\r\n"
								+ "    \"messageId\" : \"SBIFI006153505570608947\",\r\n"
								+ "    \"originalMessageId\" : \"{{msgId}}\",\r\n"
								+ "    \"msgType\" : \"JSON\",\r\n"
								+ "    \"dateTime\" : \"2026-15-05 11:07:26.256\"\r\n"
								+ "  },\r\n"
								+ "  \"User\" : {\r\n"
								+ "    \"branch\" : \"00437\",\r\n"
								+ "    \"userid\" : \"3K580036\"\r\n"
								+ "  },\r\n"
								+ "  \"ServiceInfo\" : {\r\n"
								+ "    \"customer\" : {\r\n"
								+ "      \"fname\" : \"Mayur\",\r\n"
								+ "      \"mname\" : \"\",\r\n"
								+ "      \"lname\" : \"Kharade\",  \r\n"
								+ "      \"dob\" : \"05/01/1999\",\r\n"
								+ "      \"txndatetime\" : \"02-Feb-2026 03:35:26 PM\",\r\n"
								+ "      \"urefno\" : \"SBI522516345368\"\r\n"
								+ "    }\r\n"
								+ "  }\r\n"
								+ "}\r\n"
								+ "")
						.when()
						.post("https://kioskiat.sbiuat.bank.in/lmgsvc/EIS/Ft_AmlockNameScreeningMatching_ENC");
		
						String res =response.getBody().asString();
						System.out.println(res);
		
	}     
	
	

}
