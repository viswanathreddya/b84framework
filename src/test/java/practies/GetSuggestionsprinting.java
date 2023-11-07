package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSuggestionsprinting {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=16699816852079131153&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		Thread.sleep(3000);
		//iphone 15 pro max
		List<WebElement> allsuggetions = driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
		
		for(WebElement suggestion:allsuggetions)
		{
			String name = suggestion.getText();
			System.out.println(name);
		}
		
	}

}
