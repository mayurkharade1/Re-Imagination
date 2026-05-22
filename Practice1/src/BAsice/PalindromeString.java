package BAsice;

public class PalindromeString {

	public static void main(String[] args) {
		

		String s = "mm";
		String rev="";
		
		for (int i=s.length()-1;i>=0;i--) {
			
			rev = rev +s.charAt(i);
			
		}
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println(s +" is Palindrome");
		}
		else {
			System.out.println(s +" is not Palindrome");
		}
	}

}
