package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassdata {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Raaja/Documents/Viswa%20java/Selenium/Sample14-DroupDown.html");
		 WebElement options = driver.findElement(By.id("A2"));
		 
		 Select select=new Select(options);
		 
		List<WebElement> allopt = select.getOptions();
		 
		 for(WebElement option:allopt)
		 {
			 System.out.println(option.getText());
		 }
		 
		 
		 WebElement options2 = driver.findElement(By.id("A3"));
		
		 Select select2=new Select(options2);
		 List<WebElement> selecteddatas = select2.getAllSelectedOptions();
		 for(WebElement selecteddata:selecteddatas)
		 {
			 System.out.println(selecteddata.getText());
		 }
	}
}
