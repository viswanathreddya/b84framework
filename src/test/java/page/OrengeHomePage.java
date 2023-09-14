package page;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class OrengeHomePage {
	@FindBy(xpath = "//h6[text()=\"Dashboard\"]")
	private WebElement dashboard;
	
	public OrengeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean findDashboard(WebDriverWait wait)
	{
		try {
		wait.until(ExpectedConditions.visibilityOf(dashboard));
		Reporter.log("Home page is displayed", true);
		return true;
		}
		
		catch (Exception e) {
			Reporter.log("Hope Page is not displaye", true);
			return false;
		}
	}

}
