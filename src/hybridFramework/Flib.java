package hybridFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelFile(String path, String sheet, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		Row row=sh.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		String data = cell.getStringCellValue();
		return data;
	}
	
	public int getRowCount(String path, String sheet, int rowNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		Row row=sh.getRow(rowNum);
		int rc = row.getLastCellNum();
		return rc;
		
	}
	
	public String readPropertyFile(String path, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		String data = prop.getProperty(key);
		return data;
		
	}
}
