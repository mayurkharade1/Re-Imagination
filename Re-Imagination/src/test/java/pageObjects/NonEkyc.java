package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonEkyc extends BasePage {

	public NonEkyc(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//div[@class='css-19bb58m'])[1]")
	WebElement drpTitle;
	
	
	@FindBy(xpath = "(//div[@class='css-19bb58m'])[2]")
	WebElement drpIDType;

}
