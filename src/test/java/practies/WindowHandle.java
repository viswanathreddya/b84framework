package practies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(3000);
		
		Set<String> allTab = driver.getWindowHandles();
		System.out.println(allTab.size());
		
		for(String tab:allTab)
		{
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			Thread.sleep(2000);
			 String exp= "Tracking";
//			 if(title.contains(exp))
//			 {
//				 driver.findElement(By.xpath("//a[text()='Get started']")).click();
//					System.out.println("Clicked");				 
//			 }
		
			try {
				if(title.contains(exp))
				{
					driver.findElement(By.xpath("//a[text()='Get started']")).click();
					System.out.println("Clicked");
				}
			}
			catch (Exception e) {
				System.out.println("Got Exception");
			}
		}
		
	}

}
