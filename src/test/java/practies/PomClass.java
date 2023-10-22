package practies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	
	@FindBy(id="email")
	private WebElement untextbox;
	
	@FindBy(id="pass")
	private WebElement pwdtextbox;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un)
	{
		untextbox.sendKeys(un);		
	}
	public void setPwd(String pwd)
	{
		pwdtextbox.sendKeys(pwd);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
}
