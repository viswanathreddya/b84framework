package practies;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practies1 {
	
	public WebDriver driver;
	public WebDriverWait wait;
	

	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	@AfterMethod
	public void closeApp() {
	//driver.close();
	}

}
