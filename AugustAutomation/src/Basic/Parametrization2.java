package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization2 {
	public static String getExceldata(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\shrad\\OneDrive\\Desktop\\Book1.xlsx");
		String value  = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
		return value;
	}
}
