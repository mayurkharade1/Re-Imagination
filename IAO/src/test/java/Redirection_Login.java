import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Redirection_Login {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		WebDriver wd = new ChromeDriver(options);
		wd.get("https://192.12.109.127:8445	"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "8j8 jk/");
		WebDriverWait w = new WebDriverWait(wd,Duration.ofSeconds(10));

		Thread.sleep(3000);
		String parent = wd.getWindowHandle();
		Set<String> s = wd.getWindowHandles();
		
		// Now iterate using Iterator

		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window))

			{
				wd.switchTo().window(child_window);
			//	System.out.println(wd.switchTo().window(child_window).getPageSource());

			}
		}

		wd.findElement(By.xpath("//*[@id='usernamefield21']/input")).sendKeys("1AKH3055");
		wd.findElement(By.xpath("//*[@id='passwfield21']/input")).sendKeys("MSD@12345");
		String captcha;

		captcha = JOptionPane.showInputDialog("Please Enter The Captcha");
		WebElement Captcha = wd.findElement(By.name("txtInput"));
		Captcha.sendKeys(captcha);

		////////////////////////////////Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@id=\"btn3\"]/input")).click();
		System.out.println(captcha);

		wd.manage().window().maximize();
		// Thread.sleep(5000);
		Thread.sleep(2000);
		
		//click on redirection link 
		wd.switchTo().frame("mainframe");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html[1]/body[1]/form[2]/div[1]/a[1]")).click();
		System.out.println("Clicked on Redirection link");

		w.until(ExpectedConditions.alertIsPresent()).accept();
		w.until(ExpectedConditions.alertIsPresent()).accept();
		
		//Thread.sleep(2000);		
		w.until(ExpectedConditions.alertIsPresent()).accept();
		w.until(ExpectedConditions.alertIsPresent()).accept();
		//wd.switchTo().alert().accept();

	
		Thread.sleep(000);     
		wd.switchTo().window(parent);  

		Set<String> tabs = wd.getWindowHandles();
		Iterator<String> Iterator = tabs.iterator();
		while (Iterator.hasNext()) {
			
				wd.switchTo().window(Iterator.next());
				Thread.sleep(2000);		
		}
		
		//wd.switchTo().alert().accept();
		//wd.switchTo().alert().accept();
		//Thread.sleep(5000);
		
		w.until(ExpectedConditions.alertIsPresent()).accept();
		w.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(5000);

		w.until(ExpectedConditions.alertIsPresent()).accept();
		
		//wd.switchTo().alert().accept();
		System.out.println("Tab switched to:" + wd.getTitle());
		wd.manage().window().maximize();
		Thread.sleep(2000);		

		wd.findElement(By.xpath("//*[@id=\"root\"]/div[6]/div[2]/div[2]/button/div/div/div/div/img")).click();		
		Thread.sleep(2000);	
		//clicked on Deposit	
	     w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("(//img)[8]"))).click();		
        // Clicked on account
	    //wd.findElement(By.xpath("(//img)[8]")).click();
		//Thread.sleep(2000);

		wd.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-hrw1di']//input[@id='outlined-basic']")).sendKeys("90004267596");
	    // presenceOfElementLocated condition
	    //  w.until(ExpectedConditions.presenceOfElementLocated (By.id("//react-select-5-listbox")));		
		Thread.sleep(5000);		
		wd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//------------------------------------
		

		// Get the all WebElements inside the dropdown in List  
        List dropdown_list =  wd.findElements(By.xpath("//*[@id=\"react-select-5-input\"]"));
        //wd.findElement(By.xpath("//*[@id=\"react-select-5-input\"]")).sendKeys("XXXXXXXXXXX75963");

		Thread.sleep(5000);		

        wd.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[1]"));

      
       // wd.findElement(By.cssSelector("div.css-1dimb5e-singleValue[href='//*[@id=\"root\"]/div[7]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[1]']"));
       // Printing the amount of WebElements inside the list
        System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
        for(int i=0; i<dropdown_list.size(); i++)
        {
             // Printing All the options from the dropdown
        	 System.out.println(dropdown_list.get(i));
        	 
        }    
        new Actions (wd).sendKeys(Keys.ARROW_DOWN).perform();
	    new Actions (wd).sendKeys(Keys.ENTER).perform( );	 
        
        //amount enter         
	    w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("(//input[@id='outlined-basic'])[2]"))).sendKeys("110");			     
	    w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//p[normalize-space()='PROCEED']"))).click();			     
	    w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("/html[1]/body[1]/div[1]/div[6]/div[1]/div[3]/button[3]/p[1]"))).click();			     

        //Txn pwd enter
		wd.findElement(By.xpath("//input[@id='outlined-basic']")).sendKeys("dfi@1234");			     

        //txn pwd 
	    w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("(//p[contains(text(),'PROCEED')])[2]"))).click();			     
	    w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@alt='FingerprintFirstNew']"))).click();			     
	    Thread.sleep(5000); 
	    w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("(//*[name()='svg'])[2]"))).click();		
	    w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("(//p[contains(text(),'PROCEED')])[3]"))).click();		
         
	    //new Actions (wd).sendKeys(Keys.ARROW_DOWN).perform();
	    //new Actions (wd).sendKeys(Keys.ENTER).perform();

	    
	}
}
