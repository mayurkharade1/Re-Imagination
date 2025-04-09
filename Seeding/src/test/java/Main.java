import org.openqa.selenium.WebDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		Aadhar_Seeding s=new Aadhar_Seeding();
		
		Login lgn=new Login();
		
		lgn.login1();
		Thread.sleep(30000);
		s.Seeding();
		
		s.teardown();
	}

}
