package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LogOutPage;
import page.LoginPage;
import page.LoginPage1;

public class ValidLoginLogOut extends BaseTest
{
	@Test(priority = 1,groups= {"smoke","regression"})
	public void testValidLogin()
	{
		String un=Excel.getCellValue(xl_path, "ValidLogin", 1, 0);
		String pw=Excel.getCellValue(xl_path, "ValidLogin", 1, 1);
//		1. enter valid un
		LoginPage1 loginPage1=new LoginPage1(driver);
		loginPage1.setUserName(un);
//		2. enter valid pw
		loginPage1.setPassword(pw);
//		3. click login button
		loginPage1.clickLoginButton();
//		4. home page should be displayed
		
//		5.verify that login page is displayed
		
		LogOutPage logoutPage=new LogOutPage(driver);
		logoutPage.clickLogout();
		
		
		boolean result = logoutPage.verifyLoginPageIsDisplayed(wait);
		Assert.assertTrue(result);
	}
}
