package Tutorial_ninja;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
