package Seleniumpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrizedmethodp {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream File= new FileInputStream("C:\\Users\\shrad\\OneDrive\\Desktop\\Book1.xlsx");
	
	String value = WorkbookFactory.create(File).getSheet("Credentials").getRow(1).getCell(0).getStringCellValue();
	
	System.out.println(value);
}
}
