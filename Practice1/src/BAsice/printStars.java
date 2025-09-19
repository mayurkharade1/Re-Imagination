package BAsice;



public class printStars {
	
	public static void main(String[] args) {
		int row, numberofstars;
		
		for (row = 1; row<=10; row++) {
			
			for (numberofstars=1; numberofstars<=row; numberofstars++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
