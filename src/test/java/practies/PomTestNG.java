package practies;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PomTestNG extends PomClass{	

	public PomTestNG(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testLoginPage()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		PomClass pc=new PomClass(driver);
		pc.setUsername("8185040077");
		pc.setPwd("iamlonly");
		pc.clickOnLoginButton();
		
	}
}
