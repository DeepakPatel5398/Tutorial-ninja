package Tutorial_ninja;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	WebDriver driver;
	
	Actions act;
	JavascriptExecutor js;
	
	Pages(WebDriver driver){
		this.driver=driver;
		this.act = new Actions(driver);
		this.js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// locate Element of WebPage using @FindBy annotations	
	@FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo']")
	WebElement homepageURL;

	@FindBy(xpath = "(//a[text()='Phones & PDAs'])[1]")
	WebElement PhoneSection;
	
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	WebElement htcmobile;
	
	@FindBy(xpath = "//a[@href='#tab-review']")
	WebElement review;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement namefield;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	WebElement reviewfield;
	
	@FindBy(xpath = "(//input[@type='radio'])[5]")
	WebElement ratings;
	
	@FindBy(xpath = "//button[@id='button-review']")
	WebElement continueButton;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement quantityinputbox;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement addtocartButton;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	WebElement shopingcartButton;
	
	@FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart'])[2]")
	WebElement seeCart;
	
	
	String name="Deepak patel";
	String review1="htc mobile is good. I seems that this tool will be very helpful.";
	String numberofitemstopurchase= "4";
	
	// create method to enter test data
	public void HTCMobilepurchaseTest() throws InterruptedException, IOException {
		
		homepageURL.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		act.moveToElement(PhoneSection).build().perform();
		Thread.sleep(2000);		
		PhoneSection.click();
		
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		htcmobile.click();
		
		review.click();
		
		js.executeScript("window.scrollBy(0,200)");
		reviewfield.click();

		js.executeScript("window.scrollBy(0,400)");
		namefield.sendKeys(name);

		Thread.sleep(2000);
		reviewfield.sendKeys(review1);

		Thread.sleep(2000);
		ratings.click();

		Thread.sleep(2000);
		continueButton.click();

		js.executeScript("window.scrollBy(0,-200)");

		Thread.sleep(2000);

		quantityinputbox.clear();
		quantityinputbox.sendKeys(numberofitemstopurchase);

		Thread.sleep(2000);
		addtocartButton.click();
		shopingcartButton.click();

		Thread.sleep(2000);

		seeCart.click();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File decFile = new File("C:\\Users\\deepa\\OneDrive\\Pictures\\Screenshots\\image1.png");
		FileUtils.copyFile(srcFile, decFile);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
