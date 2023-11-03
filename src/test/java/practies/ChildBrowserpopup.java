package practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Raaja/Documents/Viswa%20java/Selenium/Sample10-PopUP.html");
		driver.findElement(By.xpath("//a[tect()='Child window']")).click();
		Thread.sleep(30000);
		Set<String> allbrowsers = driver.getWindowHandles();
	
		for(String browser:allbrowsers)
		{
			
		}
	}

}
