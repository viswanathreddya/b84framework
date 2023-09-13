package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel {
	public static String getCellValue(String path, String sheet, int r, int c) 
	{
		try {
			
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));			
			String v = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			wb.close();
			return v;
			
		} catch (EncryptedDocumentException | IOException e) {
			
			e.printStackTrace();
			return "";
		}
	}
	public static int getrowCount(String path, String sheet) 
	{
		try {
			
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));			
			int rc = wb.getSheet(sheet).getLastRowNum();
			wb.close();
			return rc;
			
		} catch (EncryptedDocumentException | IOException e) {
			
			e.printStackTrace();
			return 0;
		}
		}
	public static int getColumnCount(String path, String sheet, int r) 
	{
		try {
			
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));			
			
			int cc = wb.getSheet(sheet).getRow(r).getLastCellNum();
			wb.close();
			return cc;
			
		} catch (EncryptedDocumentException | IOException e) {
			
			e.printStackTrace();
			return 0;
		}
	}
	public static void setCellValue(String path, String sheet, int r, int c,String v) 
	{
		try {
			
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));			
			wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(v);
			wb.write(new FileOutputStream(path));
			
			wb.close();
			
			
		} catch (EncryptedDocumentException | IOException e) {
			
			e.printStackTrace();
			
		}
	}

}
