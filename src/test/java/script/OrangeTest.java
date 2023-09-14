package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.OrengeHRMpage;
import page.OrengeHomePage;

public class OrangeTest extends BaseTest {
	@Test(priority = 1)
	public void testOrangeTest()
	{
		String vun = Excel.getCellValue(xl_path, "ValidLogin", 2, 0);
		String vpwd = Excel.getCellValue(xl_path, "ValidLogin", 2, 1);
		
		OrengeHRMpage hrmPage= new OrengeHRMpage(driver);
		hrmPage.setUN(vun);
		hrmPage.setPwd(vpwd);
		hrmPage.clickLogin();
		OrengeHomePage home=new OrengeHomePage(driver);
		boolean result = home.findDashboard(wait);
		Assert.assertTrue(result);
		
	}

}
