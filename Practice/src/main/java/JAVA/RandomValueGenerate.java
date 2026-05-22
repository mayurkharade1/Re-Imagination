package JAVA;
import org.apache.commons.lang3.RandomStringUtils;


public class RandomValueGenerate {
	int i=0;
	
	public static int randomeNumber(int num)
	{
		java.lang.String generatedString=RandomStringUtils.randomNumeric(num);
		java.lang.String Number= "8"+generatedString;
		return i;
	}

	public static void main(String[] args) 
	{
		
		
		RandomValueGenerate.randomeNumber(8);

	}

}
