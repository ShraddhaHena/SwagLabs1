package Basic;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
public static void main(String[] args) {
	WebDriver driver = userdefine.openBrowser("https:www.facebook.com");
	WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("abc@gmail.com");
}
}
 