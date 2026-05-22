package JAVA;
import java.lang.String;

public class SeparateAlphaNumeric {

	public static void main(String[] args) {
		
		String n = "tg85b504gh0t4ht40";
		String alpha = "";
		String num="";
		int acount = 0,ncount=0;
		for (int i = 0; i<n.length();i++) {
			
			char c= n.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				alpha= alpha+ c;
				acount++;
			}
			if(Character.isDigit(c)) {
				num= num+ c;
				ncount++;
			
			}
		}
		System.out.println(acount +" : "+ alpha);
		System.out.println(ncount +" : "+ num);
		System.out.println();
	}

}
