package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/b/?_encoding=UTF8&node=16225009011&pd_rd_w=xxLhT&content-id=amzn1.sym.5232c45b-5929-4ff0-8eae-5f67afd5c3dc&pf_rd_p=5232c45b-5929-4ff0-8eae-5f67afd5c3dc&pf_rd_r=4EAT3VN6S3CXST2AM9ED&pd_rd_wg=5X6zB&pd_rd_r=c7022f2a-48a6-4c10-9d4f-4badac53f73b&ref_=pd_gw_unk");
		WebElement droupdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		 Select select = new Select(droupdown);
		List<WebElement> alloptions = select.getOptions();
		WebElement first = alloptions.get(9);
		System.out.println(first.getText());

		Actions actions=new Actions(driver);
		Actions a = actions.click();
		
		
			
		
		select.selectByIndex(9);
		
		
	}

}
