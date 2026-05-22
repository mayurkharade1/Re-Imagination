package BAsice;

public class Stringss {

	public static void main(String[] args) 
	{
		String s ="am not there";
		
		System.out.println(s.length());
		
		String[] sa=s.split(" ");
		System.out.println(sa[0]);
		for (String a : sa) {
            System.out.println(a);
        }

	}

}
