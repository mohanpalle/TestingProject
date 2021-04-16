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

public class ReadMultipleValues {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./data/ExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Places");
		Flib flib=new Flib();
		int rc = flib.getRowCount("./data/ExcelData.xlsx", "Places");
		
		for(int i=0;i<=rc;i++)
		{
			Row row = sheet.getRow(i);
			for (int j = 0; j <=1; j++) {
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.print(" "+data);
				
			}
			System.out.println();
		}

	}

}
