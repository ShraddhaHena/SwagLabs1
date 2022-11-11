package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {
public static void main(String[] args) {
	WebDriver driver=  userdefine.openBrowser("https://demoqa.com/text-box");
	WebElement firstname = driver.findElement(By.xpath("//input[@id = 'userName']"));
	firstname.sendKeys("Heena");
	Actions action = new Actions(driver);
	
	action.sendKeys(Keys.TAB);
	action.sendKeys("xyz@gmail.com");
	
	action.sendKeys(Keys.TAB);
	action.sendKeys("velocity katraj pune");
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a"); 
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);

	action.sendKeys(Keys.TAB);

	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);

	action.build().perform();  			 // build() method helps to execute all the programm at a time
	
	
	
	
	
	
	
	
	
	}
}
