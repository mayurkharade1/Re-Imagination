package BAsice;

public class reverseNumber {
	
	public static void main(String[] args) {
		
		int num =989898;
		int revNum=0;
		
		while(num>0) {
			
			revNum= revNum * 10;
			revNum= revNum + num%10;
			num=num/10;
			
		}
		
		System.out.println(revNum);
	}

}
