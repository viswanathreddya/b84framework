package practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseExcel {
	@Test
	public void test() throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/actiTime.xlsx"));
		Sheet s = wb.getSheet("ValidLogin");
		int rn = s.getLastRowNum();
		for(int i=0;i<=rn;i++)
		{
			try {
				short cc = s.getRow(i).getLastCellNum();
				for(int j=0; j<2; j++)
				{
					try {
					String data = s.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data+" ");
					}
					catch (Exception e) {
						System.out.println("--");
					}
				}
				System.out.println();
			}
			catch (Exception e) {
				System.out.println("------------");
			}
		}
		wb.close();
		
	}

}
