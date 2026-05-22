package RestAssuredAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import Config.reqBody;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AccountOpening {
	
	static String requestid;
	
	@Test (priority=1)
	void AmlockSearch()
	{
		reqBody rb = new reqBody();
		//System.out.println(rb.reqAmlockSearch);
		
		Response response = RestAssured.given()
		        .header("Content-Type", "application/json")
		        .body(rb.amlocksearch())
		        .when()
		        .post("https://kioskiat.sbiuat.bank.in/lmgsvc/EIS/Ft_AmlockNameScreeningMatching_ENC");

		String res = response.getBody().asString();
		requestid=response.jsonPath().getString("ServiceInfo.productinfo.requestid");
		System.out.println("Status Code: " + response.getStatusCode());
		
		System.out.println("Amlock Response:");
		System.out.println(requestid);
	
	}
	
	@Test (priority=2)
	void CifAccountCreation()
	{
		reqBody rb = new reqBody();

		//System.out.println(rb.AccountOpen(requestid));

		Response response = RestAssured.given()
		        .header("Content-Type", "application/json")
		        .header("Accept-Encoding", "gzip,deflate,br")
		        .body(rb.AccountOpen(requestid))
		        .when()
		        .post("https://kioskiat.sbiuat.bank.in/accountopening/aoCifAndAccountService");

		String res = response.getBody().asString();
		String status= response.jsonPath().getString("TxnResp.sts");
		String cif= response.jsonPath().getString("customerDetails.cifno");
		String accno= response.jsonPath().getString("customerDetails.accno");

		//System.out.println("Request Body:");
		//System.out.println(rb.AccountOpen(requestid));
		//System.out.println("Response: ");
		System.out.println(res);
		System.out.println("15 Hit Status Code: " + response.getStatusCode());
		if (status.equals("S")) {
			System.out.println("CIF and Account Creation Successful");
			System.out.println("CIF: "+ cif + " Account No: "+accno);
		}
		else {
			System.out.println("CIF and Account Creation Failed...!");	
		}
		Assert.assertEquals(status, "S");

		
	}

}
