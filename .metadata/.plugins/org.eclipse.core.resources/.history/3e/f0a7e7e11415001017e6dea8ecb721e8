package testBase;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;

	@BeforeClass
	public void Login() 
	{
		logger=LogManager.getLogger(this.getClass());
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://kioskisd.bank.sbi/unifyapp/login/");
		
		LoginPage lp = new LoginPage(driver);
		
		
		lp.enterUserID("3K580037");
		lp.enterPassword("Ghi@1234");
		lp.enterCapcha();
		lp.clickProceed();
		lp.clickFpScanner();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(15000);
		//driver.quit();
		
	}
}
