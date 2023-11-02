package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisabeTextBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Raaja/Documents/Viswa%20java/Selenium/Sample8.html");
		String text = driver.findElement(By.id("A1")).getAttribute("value");
		System.out.println(text);
	}

}
