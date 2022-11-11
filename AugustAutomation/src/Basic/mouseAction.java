package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {
public static void main(String[] args) {
	WebDriver driver = userdefine.openBrowser("http://demo.guru99.com/test/simple_context_menu.html\r\n");
	
	WebElement rightclick = driver.findElement (By.xpath("//span[text()='right click me']"));
	
	Actions action = new Actions(driver); // Webdriver cant access action as Webdriver dont have  action method in its body
	                                      //so here we need to create on
	action.contextClick(rightclick); //to right click on page guru 99
	action.perform(); // we have use compulsory method from action class
	
	WebElement doubleclick = driver.findElement (By.xpath("//button[@ondblclick='myFunction()']"));
 action.contextClick(doubleclick);//to double click on page guru 99
 action.perform(); 
	
	
	
}

}
