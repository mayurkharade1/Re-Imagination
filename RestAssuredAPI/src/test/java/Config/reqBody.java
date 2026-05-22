package Config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.apache.commons.lang3.RandomStringUtils;

public class reqBody {
	
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5).toLowerCase();
		return generatedString;
	}
	
	public static String msgId()
	{
		String generatedString=RandomStringUtils.randomNumeric(14);
		String Number= "1"+generatedString;
		return Number;
	}
	public static String refNo()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		String Number= "SBI26"+generatedString;
		return Number;
	}
	public static String mobNo()
	{
		String generatedString=RandomStringUtils.randomNumeric(8);
		String Number= "94"+generatedString;
		return Number;
	}
	public static String firstIdNo()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(3).toUpperCase();
		String Number= "25f9HVvf"+generatedString +"3";
		return Number;
	}
	public static String dateTime()
	{
		DateTimeFormatter formatter =
		        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

		String currentDateTime =
		        LocalDateTime.now().format(formatter);

	        return currentDateTime;
	}
	public static String txndatetime()
	{
		DateTimeFormatter formatter =
		        DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a", Locale.ENGLISH);

		String formattedDate =
		        LocalDateTime.now().format(formatter);

	        return formattedDate;
	}
	public static String frm60SubDt()
	{
		 DateTimeFormatter formatter =
	                DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        String currentDate =
	                LocalDate.now().format(formatter);

	        return currentDate;
	}
	
	
	public String amlocksearch(){
		
	String reqAmlockSearch="{\r\n"
			+ "  \"TxnMeta\" : {\r\n"
			+ "    \"accode\" : \"AMLOCKSCREENMATCH\",\r\n"
			+ "    \"code\" : \"AMLOCKSCREENMATCH\",\r\n"
			+ "    \"subcode\" : \"AMLOCK\",\r\n"
			+ "    \"id\" : \"WEB5-6827-4dab-9956-2d2d8611fd4a\",\r\n"
			+ "    \"msgId\" : \""+reqBody.msgId() +"\"\r\n"
			+ "  },\r\n"
			+ "  \"Message\" : {\r\n"
			+ "    \"messageId\" : \"SBIFI006153505570608947\",\r\n"
			+ "    \"originalMessageId\": \""+reqBody.msgId() +"\",\r\n"
			+ "    \"msgType\" : \"JSON\",\r\n"
			+ "    \"dateTime\" : \""+reqBody.dateTime() +"\"\r\n"
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
			+ "      \"txndatetime\" : \""+reqBody.txndatetime()+"\",\r\n"
			+ "      \"urefno\" : \"SBI522516345368\"\r\n"
			+ "    }\r\n"
			+ "  }\r\n"
			+ "}\r\n"
			+ "";
	return reqAmlockSearch;
	
}
	
	
	
	public String AccountOpen(String requestid) {
		
		
		String req="{\r\n"
				+ "  \"TxnMeta\": {\r\n"
				+ "    \"accode\": \"AccountServicesCall\",\r\n"
				+ "    \"code\": \"AccountServicesCall\",\r\n"
				+ "    \"subcode\": \"KYC\",\r\n"
				+ "    \"id\": \"WEB0-6ed5-4615-a06a-dbeb6d665ca1\",\r\n"
				+ "    \"msgId\": \""+msgId()+"\",\r\n"
				+ "    \"txnTime\": \""+msgId()+"\",\r\n"
				+ "    \"latlong\": null,\r\n"
				+ "    \"accTkn\": null,\r\n"
				+ "    \"tmode\": \"\"\r\n"
				+ "  },\r\n"
				+ "  \"ServiceInfo\": {\r\n"
				+ "    \"Customer\": {\r\n"
				+ "      \"branchId\": \"00437\",\r\n"
				+ "      \"koId\": \"3K580037\",\r\n"
				+ "      \"form6061\": \"0\",\r\n"
				+ "      \"nomineeFlag\": \"Y\",\r\n"
				+ "      \"pan\": \"\",\r\n"
				+ "      \"dateCreated\": \""+frm60SubDt()+"\",\r\n"
				+ "      \"fatherName\": \"FfnameFmnsme\",\r\n"
				+ "      \"spouseLname\": \"\",\r\n"
				+ "      \"placeOfBirth\": \"Pune\",\r\n"
				+ "      \"villageCode\": \"2752104199556895\",\r\n"
				+ "      \"accNo\": \"\",\r\n"
				+ "      \"agrInnAnn\": \"\",\r\n"
				+ "      \"refNo\": \""+refNo()+"\",\r\n"
				+ "      \"frm60SubDt\": \"\",\r\n"
				+ "      \"transDt\": \"\",\r\n"
				+ "      \"othAgrInAnn\":\"\",\r\n"
				+ "      \"aadhaarVrn\": \"731817444183\",\r\n"
				+ "      \"cifNo\": \"\",\r\n"
				+ "      \"lcpcBranchEnquiryNumber\": \"\",\r\n"
				+ "      \"panAppl\": \"N\",\r\n"
				+ "      \"mobile1\": \""+mobNo()+"\",\r\n"
				+ "      \"caste\": \"B\",\r\n"
				+ "      \"otherReligion\": \"\",\r\n"
				+ "      \"religion\": \"H\",\r\n"
				+ "      \"address1\": \"CBD Belapur\",\r\n"
				+ "      \"address2\": \"Thane\",\r\n"
				+ "      \"address3\": \"Navi Mumbai\",\r\n"
				+ "      \"sourceOfFunds\": \"03\",\r\n"
				+ "      \"firstName\": \"Mayur\",\r\n"
				+ "      \"middleName\": \"\",\r\n"
				+ "      \"lastName\": \"Kharade\",\r\n"
				+ "      \"dob\": \"05/06/1999\",\r\n"
				+ "      \"zipCode\": \"413102\",\r\n"
				+ "      \"title\": \"0007\",\r\n"
				+ "      \"fatherPrefix\": \"09\",\r\n"
				+ "      \"fatherFName\": \"Ffname\",\r\n"
				+ "      \"fatherMName\": \"\",\r\n"
				+ "      \"fatherLName\": \"Fmnsme\",\r\n"
				+ "      \"motherPrefix\": \"03\",\r\n"
				+ "      \"motherFName\": \"Mfn\",\r\n"
				+ "      \"motherMName\": \"\",\r\n"
				+ "      \"motherLName\": \"Mln\",\r\n"
				+ "      \"cKYCAddressType\": \"01\",\r\n"
				+ "      \"cKYCDistrict\": \"521\",\r\n"
				+ "      \"productType\": \"16111431\",\r\n"
				+ "      \"dateOfPanApplied\": \"\",\r\n"
				+ "      \"ackNoForPanApplied\": \"\",\r\n"
				+ "      \"city\": \"400\",\r\n"
				+ "      \"country\": \"IN\",\r\n"
				+ "      \"phone\": \"\",\r\n"
				+ "      \"firstIdType\": \"49\",\r\n"
				+ "      \"firstIdNo\": \""+firstIdNo()+"\",\r\n"
				+ "      \"nationality\": \"IN\",\r\n"
				+ "      \"relativeMName\": \"\",\r\n"
				+ "      \"relativeLName\": \"Fmnsme\",\r\n"
				+ "      \"relativeFName\": \"Ffname\",\r\n"
				+ "      \"gender\": \"M\",\r\n"
				+ "      \"maritalStatus\": \"S\",\r\n"
				+ "      \"secondIdType\": \"\",\r\n"
				+ "      \"secondIdNo\": \"\",\r\n"
				+ "      \"occupation\": \"0101\",\r\n"
				+ "      \"eduCode\": \"03\",\r\n"
				+ "      \"citizenship\": \"IN\",\r\n"
				+ "      \"district\": \"521\",\r\n"
				+ "      \"ckycSpouseNameTitle\": \"\",\r\n"
				+ "      \"ckycSpouseNameFirstName\": \"\",\r\n"
				+ "      \"ckycSpouseNameMiddleName\": \"\",\r\n"
				+ "      \"ckycSpouseNameLastName\": \"\",\r\n"
				+ "      \"ckycAddressProof\": \"\",\r\n"
				+ "      \"ckycAddressProofOthers\": \"E\",\r\n"
				+ "      \"addressType\": \"\",\r\n"
				+ "      \"ckycProofOfAddress\": \"25f9HVvfFST3\",\r\n"
				+ "      \"annualIncome\": \"300\",\r\n"
				+ "      \"OtherOccupationDesc\": \"101\",\r\n"
				+ "      \"panAadharLink\": \"N\",\r\n"
				+ "      \"ckycEffectiveDate\": \"2026/05/20\",\r\n"
				+ "      \"state\": \"27\",\r\n"
				+ "      \"ckycOccupation\": \"S2\",\r\n"
				+ "      \"organisationName\": \"\",\r\n"
				+ "      \"occupationsubtype\": \"0100\",\r\n"
				+ "      \"requestid\": \""+requestid+"\",\r\n"
				+ "      \"nominee_count\": \"2\",\r\n"
				+ "      \"nominee_Successive\": \"\",\r\n"
				+ "      \"disabilityFlag\": \"N\",\r\n"
				+ "      \"disabilityType\": \"V\",\r\n"
				+ "      \"disabilitySubType\": \"02\",\r\n"
				+ "      \"udidNo\": \"MH\",\r\n"
				+ "      \"udidValidity\": \"\",\r\n"
				+ "      \"udidDisabilityPercentage\": \"\",\r\n"
				+ "      \"udidIssueDate\": \"\",\r\n"
				+ "      \"identificationMarks\": \"\"\r\n"
				+ "    },\r\n"
				+ "    \"NomineeDetails\": [\r\n"
				+ "      {\r\n"
				+ "        \"nomineeAge\": \"21\",\r\n"
				+ "        \"nomineeDob\": \"24/04/2004\",\r\n"
				+ "        \"gurdianAddress\": \"\",\r\n"
				+ "        \"gurdianAddress2\": \"\",\r\n"
				+ "        \"gurdianAge\": \"\",\r\n"
				+ "        \"gurdianName\": \"\",\r\n"
				+ "        \"passbookPrintFlag\": \"Y\",\r\n"
				+ "        \"nomineeAddress\": \"Mumbai\",\r\n"
				+ "        \"nomineeName\": \"Nom one\",\r\n"
				+ "        \"nomineeRelationCode\": \"001\",\r\n"
				+ "        \"nom_order\": \"1\",\r\n"
				+ "        \"nom_percent\": \"50\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"nomineeAge\": \"27\",\r\n"
				+ "        \"nomineeDob\": \"23/04/1998\",\r\n"
				+ "        \"gurdianAddress\": \"\",\r\n"
				+ "        \"gurdianAddress2\": \"\",\r\n"
				+ "        \"gurdianAge\": \"\",\r\n"
				+ "        \"gurdianName\": \"\",\r\n"
				+ "        \"passbookPrintFlag\": \"N\",\r\n"
				+ "        \"nomineeAddress\": \"Pune\",\r\n"
				+ "        \"nomineeName\": \"Nom two\",\r\n"
				+ "        \"nomineeRelationCode\": \"004\",\r\n"
				+ "        \"nom_order\": \"2\",\r\n"
				+ "        \"nom_percent\": \"50\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
	return req;
	
	}
	public static void main(String[] args) {
		reqBody rb = new reqBody();
		System.out.println(rb.AccountOpen("SBIFA26135113450028608947"));
	}

}
