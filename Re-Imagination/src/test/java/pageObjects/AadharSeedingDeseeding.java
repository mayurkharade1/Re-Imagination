package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AadharSeedingDeseeding extends BasePage
{

	Actions act= new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor) driver;

	public AadharSeedingDeseeding(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Enter Aadhaar Number']")
	WebElement txtUIDno;
	@FindBy(xpath = "//input[@placeholder='Enter Account Number']")
	WebElement txtAccno;
	@FindBy(xpath = "//p[text()='PROCEED']")
	WebElement btnProceed;
	@FindBy(xpath = "//p[text()='Aadhaar De-Seeding']")
	WebElement DeseedingTab;

	@FindBy(xpath = "//input[@placeholder='Enter Aadhaar Number'][ @maxlength='12']")
	WebElement txtDeseedUID;
	@FindBy(xpath = "//input[@placeholder='Enter Aadhaar Number'][ @maxlength='11']")
	WebElement txtDeseedAccNo;
	@FindBy(xpath = "//p[text()='Another Payment']")
	WebElement btnAnotherPayment;
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtAgentPass;
	@FindBy(xpath = "//div[@class='modal-content']//p[text()='PROCEED']")
	WebElement btnProceedAgntAuth;
	@FindBy(xpath = "//button[text()='YES, I DO']")
	WebElement btnConsentYes;
	@FindBy(xpath = "//img[@alt='FingerprintFirstNew']")
	WebElement btnCustFpScan;
	@FindBy(xpath = "//div[@class='modal-content']//p[text()='PROCEED']")
	WebElement btnProceedCustAuth;
	
	public String captureScreen(String tname) throws IOException {
		
				String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
						
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
				
				String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
				File targetFile=new File(targetFilePath);
				
				sourceFile.renameTo(targetFile);
					
				return targetFilePath;
		
			}


	public void clickOnDeseedingMenu(){

		DeseedingTab.click();
	}
	public void EnterUIDtoDeseeding(String UID){

		txtDeseedUID.sendKeys(UID);;
	}
	public void EnterAcctoDeseeding(String AccNo){

		txtDeseedAccNo.sendKeys(AccNo);;
	}

	public void EnterUIDtoseeding(String UID){

		txtUIDno.sendKeys(UID);;
	}
	public void EnterAcctoseeding(String AccNo){

		txtAccno.sendKeys(AccNo);;
	}
	public void clickOnproceed(){

		//btnProceed.click();
		//js.executeScript("arguments[0].scrollIntoView();", btnProceed);
		//btnProceed.click();
		js.executeScript("arguments[0].click();",btnProceed);
	}	
	public void clickOnAnotherPayment(){

		//btnAnotherPayment.click();
		js.executeScript("arguments[0].click();",btnAnotherPayment);
	}	
	public boolean ReceiptPage(){

		boolean p=btnAnotherPayment.isDisplayed();
		return p;
	}
	public void EnterAgentPassword(String pass){

		txtAgentPass.sendKeys(pass);;
	}	

	public void ProceedAgentPassword(){
		//btnProceedAgntAuth.click();;
		js.executeScript("arguments[0].click();",btnProceedAgntAuth);
	}	

	public void YesToPanConsent(){
		//btnProceedAgntAuth.click();;
		js.executeScript("arguments[0].click();",btnConsentYes);
	}
	public void ClickOnCustFpScan(){
		//btnProceedAgntAuth.click();;
		js.executeScript("arguments[0].click();",btnCustFpScan);
	}
	
	public void ClickOnProceedCustAuth(){
		//btnProceedAgntAuth.click();;
		js.executeScript("arguments[0].click();",btnProceedCustAuth);
	}


}
