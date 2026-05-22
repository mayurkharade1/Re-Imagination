package JAVA;
import java.lang.String;

public class DuplicateElementInString {

	public static void main(String[] args) {

		 String name= "Makajdkam";
		 
		 String res="";
		 int dup=0;
		 
		 for (int i=0;i<name.length();i++) {
			 
			 if(res.contains(""+name.charAt(i))) {
				 dup++;
				 continue;
				 
			 }
			 
			 res=res+name.charAt(i);
		 }
		 
		 System.out.println(res);
			System.out.println(dup);
	}

}
