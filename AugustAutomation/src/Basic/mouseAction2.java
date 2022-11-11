package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseAction2 {
public static void main(String[] args) {
	WebDriver driver =userdefine.openBrowser("https://www.amazon.in/");
	WebElement signIn = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
	
	Actions action = new Actions(driver);
	action.moveToElement(signIn);
	action.perform();
	
	
}
}
