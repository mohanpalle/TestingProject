package bindingtheXLFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
		public String readExcel(String path, String sheet, int rowNum, int cellNum) throws IOException
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			Row row = sh.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			String data=cell.getStringCellValue();
			
			return data;
		}
		
		public int getRowCount(String path, String sheet) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			int rc = sh.getLastRowNum();
			return rc;
		}
}
