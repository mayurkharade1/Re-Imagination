package Interface;

public class InterfaceDemo implements I1,I2
{
	
	
	public void cal(int a) {
		System.out.println(a);
		
	}
	
	void classMethod() 
	{
	System.out.println("This is method from class");	
		
	}

	public static void main(String[] args) {
		
		InterfaceDemo id= new InterfaceDemo();
		
		System.out.println(I1.a);
		
		id.cal(20);
		id.m1();
		System.out.println(I2.a);
		I2.m2();
		id.classMethod();

	}

	

	
	

}
