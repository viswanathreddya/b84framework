package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrengeHRMpage {
	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath = "//button[text()=\" Login \"]")
	private WebElement login;

	
	public OrengeHRMpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setUN(String u)
	{
		un.sendKeys(u);
	}
	public void setPwd(String p)
	{
		pwd.sendKeys(p);
	}
	public void clickLogin()
	{
		login.click();
	}
}
