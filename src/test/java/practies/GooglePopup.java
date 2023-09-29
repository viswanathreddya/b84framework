package practies;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePopup {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http:/www.google.com");		
		WebDriver frm = driver.switchTo().frame("callout");
		Thread.sleep(5000);
		frm.findElement(By.xpath("//button[text()=\"Stay signed out\"]")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}
