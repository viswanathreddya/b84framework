package practies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Intervew1 {
	
	@Test
	public void m1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://trello.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath("(//a[.='Log in'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//span[.='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//span[.='Log in']")).click();
		
		String actual = driver.getCurrentUrl();
		String expected= "Home page";
		
		if(expected.equalsIgnoreCase(actual))
		{
			Reporter.log("TC is pass", true);
		}
		else
		{
			Reporter.log("TC is fail", true);
		}
		
					
	}

}
