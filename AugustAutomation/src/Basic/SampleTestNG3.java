package Basic;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleTestNG3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = userdefine.openBrowser("https:www.facebook.com");
		
		String mailId = SampleTestNG2.getExceldata("credetials",1,0);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(mailId);
		
	}
}
//parametrized method
