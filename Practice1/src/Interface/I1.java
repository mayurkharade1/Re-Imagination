package Interface;

public interface I1 {
	
	int a=100;
	int b=200;
	
	default void m1()
	{
		
		System.out.println("This is m1 from I1");
	}

}
