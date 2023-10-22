package practies;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fb extends Practies1{
	
	@Test
	public void loginPage()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8185040077");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//wait.until(ExpectedConditions.visibilityOf(but));
	}

}
