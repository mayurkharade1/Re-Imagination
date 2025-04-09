

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kioskuat.bank.sbi/unifyapp/login/");
		
		WebElement img =driver.findElement(By.xpath("//img[@alt='CaptchaImage']"));
		
		String url=img.getAttribute("src");
		
		System.out.println(url);
		
		URL url1= new URL(url);
		
		Image image= ImageIO.read(url1);
	}

}
