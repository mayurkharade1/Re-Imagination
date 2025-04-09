import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aadhar_Deseeding extends Login {

	WebDriverWait w = new WebDriverWait(wd, Duration.ofSeconds(50));

	public void Enquiry_RefNo() throws InterruptedException {

		// clicked on IAO
		getdriver().findElement(By.xpath("//a[normalize-space()='Account Opening']")).click();
		Thread.sleep(1000);

		// Clicked on Account Opening Enquiry and Form Generation menu
		// clicked on IAO
		getdriver().findElement(By.xpath("//a[normalize-space()='Account Opening Enquiry and Form Generation']"))
				.click();
		Thread.sleep(1000);
		
		// Enter REF No
		getdriver().findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo']//input[@id='outlined-disabled']")).click();
		
		//Clicked on SEARCH Button
		getdriver().findElement(By.xpath("//p[normalize-space()='SEARCH']//p[normalize-space()='SEARCH']"))
		.click();
Thread.sleep(1000);

	}

}
