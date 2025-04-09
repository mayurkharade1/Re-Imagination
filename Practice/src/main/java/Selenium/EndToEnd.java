package Selenium;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		/*String Date ="15";
		String Month="";
		String Year="2022";
		
		
		driver.findElement(By.xpath("//input[@id='start-date']")).click();*/
		
		WebElement Startbtn =driver.findElement(By.xpath("//button[@class='start']"));
		
		Startbtn.click();
		System.out.println("Clicked on Start button");
		
		WebElement Stopbtn=driver.findElement(By.xpath("//button[@class='stop']"));
		
	      
	      
		if (Stopbtn.isDisplayed()) {
			
			System.out.println("Stop button Enabled");
			Stopbtn.click();
			System.out.println("Clicked on Stop button");
		}
		else {
			System.out.println("Stop button Not Enabled");
		}
		
		driver.findElement(By.id("alertBtn")).click();
		driver.switchTo().alert().accept();
		System.out.println("First Alert Accepted");
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		String text=driver.findElement(By.id("demo")).getText();
		
		if (text.equals("You pressed Cancel!"))
		{
		System.out.println("Second Alert Dismissed");
		
		}else {
			
			
		}	
		
		driver.findElement(By.id("promptBtn")).click();
		//driver.switchTo().alert().
		driver.switchTo().alert().sendKeys("Mayur");
		driver.switchTo().alert().accept();
		
		System.out.println("Promp alert Text : "+ driver.findElement(By.id("demo")).getText());
		
		//Mouse Hover
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Point Me']"))).perform();
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		System.out.println("hover clicked ");
		
		
		WebElement copy = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		act.doubleClick(copy).perform();
		
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}
