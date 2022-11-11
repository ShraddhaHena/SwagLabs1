package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\shrad\\OneDrive\\Desktop\\Book1.xlsx");
		String value  = WorkbookFactory.create(file).getSheet("Credentials").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}
		}
