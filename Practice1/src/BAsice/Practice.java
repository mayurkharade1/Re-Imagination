package BAsice;

public class Practice {

	public static void main(String[] args) {


		String s = "pavanadaaabjffhjg";
		char c='f';
		int count=0;
		
		for (int i=0; i<s.length();i++) {
			
			if (s.charAt(i)==c) {
				
				count ++;
			}
		}
		System.out.println(c+":"+count);

	}

}
