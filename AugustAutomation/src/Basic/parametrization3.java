package Basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class parametrization3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver = userdefine.openBrowser("https://www.facebook.com");
	
	String value = Parametrization2.getExceldata("credentials",0,0);
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys(value);
}
}
//getting data from excel sheet with parametrization
