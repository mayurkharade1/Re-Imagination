package JAVA;
import org.apache.commons.lang3.RandomStringUtils;


public class RandomValueGenerate {
	
	
	public static void randomeNumber(int num)
	{
		java.lang.String generatedString=RandomStringUtils.randomNumeric(num);
		java.lang.String Number= "8"+generatedString;
		System.out.println(Number);
		//return Number;
	}

	public static void main(String[] args) 
	{
		
		
		RandomValueGenerate.randomeNumber(8);

	}

}
