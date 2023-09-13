package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;

public class DemoTest extends BaseTest
{

	@Test
	public void testA()
	{
		Reporter.log(driver.getTitle(),true);
		int rc = Excel.getrowCount("./data/actiTime.xlsx", "login");
		Reporter.log("RC "+rc,true);
		
		int cc = Excel.getColumnCount("./data/actiTime.xlsx", "login", 0);
		Reporter.log("CC "+cc,true);
		
		String v = Excel.getCellValue("./data/actiTime.xlsx", "login",0,0);
		Reporter.log("Value "+v,true);
		
		Excel.setCellValue("./data/actiTime.xlsx", "login",0,0,"viswa");
		
		
	}
}
