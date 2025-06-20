package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageObjects.AadharSeedingDeseeding;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	

	@BeforeClass
	@Parameters({"browser"})
	public void Login(String br) throws IOException 
	{
		logger=LogManager.getLogger(this.getClass());
		
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
		
		switch(br.toLowerCase()) 
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default : System.out.println("Browser Not Provided"); break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get(p.getProperty("AppUrl"));
		
		LoginPage lp = new LoginPage(driver);
		
		
		lp.enterUserID(p.getProperty("UserId"));
		lp.enterPassword(p.getProperty("Password"));
		lp.enterCapcha();
		lp.clickProceed();
		lp.clickFpScanner();
	}
	
//	Properties property() throws IOException{
//		FileReader file=new FileReader(".//src//test//resources//config.properties");
//		p = new Properties();
//		p.load(file);
//		return p;
//	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		//Thread.sleep(15000);
		//driver.quit();
		//driver.close();
		
	}
	//@AfterTest
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
}
