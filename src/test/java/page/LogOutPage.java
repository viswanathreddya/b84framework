package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LogOutPage 
{
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	public LogOutPage(WebDriver  driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickLogout()
	{
		logoutLink.click();
	}
	
	
	
	public boolean verifyLoginPageIsDisplayed(WebDriverWait wait)
	{
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(loginBTN));
			Reporter.log("Login Page is displayed",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("Login Page is NOT displayed",true);
			return false;
		}
	}
}
