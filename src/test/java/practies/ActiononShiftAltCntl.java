package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiononShiftAltCntl {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();//Open the empty browse
		driver.get("Sample Url");//enter the url
	//	driver.findElement(By.xpath("")).sendKeys(Keys.ALT);
		Actions actions=new Actions(driver);//created obect to action class
		actions.keyDown(Keys.SHIFT).keyDown(Keys.CONTROL).keyDown(Keys.ALT);//perform SHIFT+CONTROL+ALT
		actions.keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).keyUp(Keys.ALT);//Relaease the keys
	}

}
