package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivision {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = userdefine.openBrowser("https://www.facebook.com/");
	
	WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		
		Thread.sleep(3000);
		
	WebElement firstname  = driver.findElement(By.xpath("//input[@name='firstname']"));
    firstname.sendKeys("Shraddhanjali");
    
	Thread.sleep(3000);

    
   
	
	
}
}
