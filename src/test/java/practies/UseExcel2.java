package practies;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UseExcel2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fls=new FileInputStream("./data/actiTime.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sheet = wb.getSheet("ValidLogin");
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}

}
