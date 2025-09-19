package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int noOfLinks=allLinks.size();
		System.out.println("Total Links on Page : "+noOfLinks);
		
		int brokenlink=0;
		int nonBroken=0;
		
		
		for (WebElement link:allLinks) {
			
			String href= link.getAttribute("href");
			
			if (href.isEmpty()) {
				System.out.println("Empty");
				continue;
			}
			
			URL url= new URL(href);
			HttpURLConnection uc = (HttpURLConnection) url.openConnection();
			
			uc.connect();
			if (uc.getResponseCode()>=400) {
				
				System.out.println(href + " -Broken Link");
				brokenlink++;
				
			}
			else {
				System.out.println(href + " -Not Broken");
				nonBroken++;
			}
		}
		System.out.println("Broken: "+brokenlink + "not broken: "+ nonBroken);
		
}
}