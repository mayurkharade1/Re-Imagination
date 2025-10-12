package BAsice;

public class reverseString {

	public static void main(String[] args) {

		String original= "Welcome to world";
		
		String reverse="";
		
		for(int i =original.length()-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		
		StringBuffer s= new StringBuffer("welcome");
		System.out.println(s.reverse());

	}

}
