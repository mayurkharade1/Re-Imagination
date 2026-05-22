import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		 FluentWait<WebDriver> wait = new FluentWait<>(driver)
				 .withTimeout(Duration.ofSeconds(20))
				 .pollingEvery(Duration.ofSeconds(2))
				 .ignoring(NoSuchElementException.class);
		 
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("");
				

	}

}
